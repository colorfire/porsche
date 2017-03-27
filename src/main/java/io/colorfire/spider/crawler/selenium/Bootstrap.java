package io.colorfire.spider.crawler.selenium;

import io.colorfire.spider.crawler.CompanyCrawler;
import io.colorfire.spider.dao.CompanyInfo;
import io.colorfire.spider.dao.CompanyInfoDao;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

/**
 * 使用selenium模拟器来抓取动态的JS数据
 * 需要chrome驱动下载: https://chromedriver.storage.googleapis.com/2.28/chromedriver_mac64.zip
 * 动态代理: http://www.xdaili.cn/monitor.html?type/2
 *
 * @author colorfire on 17/3/27
 */
public class Bootstrap {

  public static void main(String[] args) throws Exception {

    System.setProperty("webdriver.chrome.driver", "/Users/weigangqiu/opts/chromedriver");
    WebDriver webDriver = new ChromeDriver();
    webDriver.manage().window().maximize();
    webDriver.get("https://www.lagou.com/gongsi/2-0-0");

    webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // 隐形等待


    HttpClient httpClient = HttpClientBuilder.create().build();
    CompanyInfoDao dao = new CompanyInfoDao();

    for (int i = 1; i < 20; i++) {
      // 1. 点击下一页
      WebElement su = webDriver.findElement(By.className("pager_next "));
      su.click();

      sleep(500);

      // 2. 抓取页面内容
      List<WebElement> list = webDriver.findElement(By.id("company_list")).findElements(By.className("item_title"));
      System.out.println(list.size());

      for (WebElement el : list) {
        String href = el.getAttribute("href");
        HttpGet httpGet = new HttpGet(href);
        HttpResponse resp = httpClient.execute(httpGet);
        String html = EntityUtils.toString(resp.getEntity());

        try {
          CompanyInfo ci = CompanyCrawler.parse(html);
          dao.addOrUpdate(ci);
          System.out.println("更新数据: " + ci.getShortName() + ". ");
        } catch (Exception ex) {
          ex.printStackTrace();
        } finally {
          sleep(800);
        }
      }

      sleep(1000);
    }

    webDriver.close();
    System.out.println("Hello World!");
  }

}
