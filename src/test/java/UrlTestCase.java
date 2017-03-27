import java.util.regex.Pattern;

/**
 * @author colorfire on 17/3/26
 */
public class UrlTestCase {
  private final static Pattern htmlUrl = Pattern.compile(".*/\\d*.html");

  final static String href = "https://www.lagou.com/gongsi/40232.html";
  final static String href2 = "https://www.lagou.com/gongsi/2-0-0";
  final static String href3 = "https://www.lagou.com/gongsi/interviewExperiences.html?companyId=8861";

  public static void main(String[] args) {
    System.out.println(htmlUrl.matcher(href).matches());
    System.out.println(htmlUrl.matcher(href2).matches());
    System.out.println(htmlUrl.matcher(href3).matches());
  }
}