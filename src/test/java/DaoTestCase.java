import io.colorfire.spider.dao.CompanyInfo;
import io.colorfire.spider.dao.CompanyInfoDao;

/**
 * @author colorfire on 17/3/27
 */
public class DaoTestCase {

  public static void main(String[] args) {
    CompanyInfoDao dao = new CompanyInfoDao();
    CompanyInfo ci = dao.get(1);
    System.out.println(ci.getName());


    ci.setId(2);
    ci.setName("中'&& >> ??  1=1 or '文");
    dao.addOrUpdate(ci);
  }
}
