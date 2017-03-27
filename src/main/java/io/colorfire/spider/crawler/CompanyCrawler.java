package io.colorfire.spider.crawler;

import io.colorfire.spider.dao.CompanyInfo;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author colorfire on 17/3/27
 */
public class CompanyCrawler {

  /**
   * 匹配html标签
   */
  public static CompanyInfo parse(String html) {
    CompanyInfo ci = new CompanyInfo();

    Document doc = Jsoup.parse(html);
    Element el = doc.getElementById("companyInfoData");
    String jsonData = el.html();

    Elements mainEls = doc.getElementsByClass("company_main");
    if (mainEls.size() > 0) {
      Element title = mainEls.get(0).getElementsByTag("a").get(0);
      ci.setShortName(title.html());
      ci.setName(title.attr("title") != null ? title.attr("title") : "");
      ci.setWebsite(title.attr("href") != null ? title.attr("href") : "");
    }

    ci.setOriginalData(jsonData);
    ci.setId(Integer.parseInt(parseJSON(jsonData, "companyId")));
    ci.setAddress(parseJSON(jsonData, "detailAddress"));
    ci.setCoordinate(parseJSON(jsonData, "lat") + "," + parseJSON(jsonData, "lng"));
    ci.setUpdateTime(parseJSON(jsonData, "updateTime"));

    // 解析json对象
    Document data = Jsoup.parse(jsonData);
    return ci;
  }

  /**
   * @param data
   * @param key
   * @return
   */
  private static String parseJSON(String data, String key) {
    String reg = key + "\":(.*?),";
    Matcher matcher = Pattern.compile(reg).matcher(data);

    if (matcher.find()) {
      return matcher.group(1).replace("\"", "");
    }
    return "";
  }

}
