package io.colorfire.spider.crawler;


import edu.uci.ics.crawler4j.crawler.Page;
import edu.uci.ics.crawler4j.crawler.WebCrawler;
import edu.uci.ics.crawler4j.parser.HtmlParseData;
import edu.uci.ics.crawler4j.url.WebURL;
import io.colorfire.spider.dao.CompanyInfo;
import io.colorfire.spider.dao.CompanyInfoDao;

import java.util.regex.Pattern;

/**
 * @author colorfire on 17/3/25
 */
public class MyCrawler extends WebCrawler {

  private final static Pattern FILTERS = Pattern.compile(".*(\\.(css|js|gif|jpg"
          + "|png|mp3|mp3|zip|gz))$");

  private final static Pattern htmlUrl = Pattern.compile(".*/\\d*.html");

  /**
   * This method receives two parameters. The first parameter is the page
   * in which we have discovered this new url and the second parameter is
   * the new url. You should implement this function to specify whether
   * the given url should be crawled or not (based on your crawling logic).
   * In this example, we are instructing the crawler to ignore urls that
   * have css, js, git, ... extensions and to only accept urls that start
   * with "http://www.ics.uci.edu/". In this case, we didn't need the
   * referringPage parameter to make the decision.
   */
  @Override
  public boolean shouldVisit(Page referringPage, WebURL url) {
    String href = url.getURL().toLowerCase();
    return !FILTERS.matcher(href).matches()
            && htmlUrl.matcher(href).matches()
            && href.startsWith("https://www.lagou.com/gongsi");
  }

  final static CompanyInfoDao dao = new CompanyInfoDao();

  /**
   * This function is called when a page is fetched and ready
   * to be processed by your program.
   */
  @Override
  public void visit(Page page) {
    String url = page.getWebURL().getURL();
    System.out.println("URL: " + url);

    if (page.getParseData() instanceof HtmlParseData) {
      HtmlParseData htmlParseData = (HtmlParseData) page.getParseData();
      String html = htmlParseData.getHtml();

      CompanyInfo ci = CompanyCrawler.parse(html);
      ci.setFromUrl(url);

      dao.addOrUpdate(ci); // 入库
      System.out.println("数据: " + ci.getShortName() + "入库成功");
    }
  }

}
