import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author colorfire on 17/3/27
 */
public class HtmlRegex {

  private final static Pattern companyEl = Pattern.compile("<script id=\"companyInfoData\" .*?>(.*?)</script>");

  public static void main(String[] args) {
    long startTime = System.currentTimeMillis();
    Matcher el = companyEl.matcher(html);
    while (el.find()) {
      String json = el.group(1);
      System.out.println(json);
    }
    System.out.println("正则执行时间:" + (System.currentTimeMillis() - startTime) + "ms");
  }


  final static String html = "\n" +
          "<!DOCTYPE html>\n" +
          "<html>\n" +
          "<head>\n" +
          "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\n" +
          "<meta name=\"renderer\" content=\"webkit\">\n" +
          "<meta property=\"qc:admins\" content=\"23635710066417756375\" />\n" +
          "<meta name=\"baidu-site-verification\" content=\"QIQ6KC1oZ6\" />\n" +
          "<meta charset=\"UTF-8\">\n" +
          "\n" +
          "<meta content=\"动动,动动招聘,动动最新招聘信息,北京慢点生活科技有限公司,北京慢点生活科技有限公司职位招聘\" name=\"keywords\">\n" +
          "\n" +
          "<meta content=\"动动在拉勾网招聘等你,我们是北京荣誉出品的动动/Pacer,我们致力于用技术的手段来帮助全世界的普通人享受到健康并富有活力的生活.动动是目前全球唯一一款在AppStore健康分类始终排名前5的应用,A...\" name=\"description\">\n" +
          "\n" +
          "<title>【动动_动动招聘】北京慢点生活科技有限公司招聘信息-拉勾网</title>\n" +
          "\n" +
          "<link rel=\"Shortcut Icon\" href=\"//www.lgstatic.com/www/static/common/static/favicon_faed927.ico\">\n" +
          "\n" +
          "\n" +
          "    \n" +
          "<script type=\"text/javascript\">\n" +
          "\n" +
          "(function() {\n" +
          "    var protocol = window.location.protocol;\n" +
          "    var host = window.location.host;\n" +
          "    var baseUrl = protocol + '//' + host;\n" +
          "\n" +
          "    window.GLOBAL_DOMAIN = window.GLOBAL_DOMAIN || {\n" +
          "        ctx: 'https://www.lagou.com',\n" +
          "        rctx: 'https://hr.lagou.com',\n" +
          "        crctx: 'https://hr.lagou.com/company',\n" +
          "        pctx: 'https://passport.lagou.com',\n" +
          "        actx: 'https://account.lagou.com',\n" +
          "        paictx: 'https://pai.lagou.com',\n" +
          "        sctx: 'https://suggest.lagou.com',\n" +
          "        zctx: 'https://yanzhi.lagou.com',\n" +
          "        ectx: 'https://easy.lagou.com',\n" +
          "        proctx: 'https://pro.lagou.com',\n" +
          "        lgsctx: protocol + '//www.lgstatic.com',\n" +
          "        FE_frontLogin: baseUrl + '/frontLogin.do',\n" +
          "        FE_frontLogout: baseUrl + '/frontLogout.do',\n" +
          "        FE_frontRegister: baseUrl + '/frontRegister.do'\n" +
          "    };\n" +
          "\n" +
          "    window.GLOBAL_CDN_DOMAIN = 'www.lgstatic.com';\n" +
          "})();\n" +
          "</script>    <!-- 动态token，防御伪造请求，重复提交 -->\n" +
          "    <script type=\"text/javascript\">\n" +
          "    window.X_Anti_Forge_Token = '01f64de0-abf7-475b-9df7-af17ef69c8d6';\n" +
          "    window.X_Anti_Forge_Code = '66823455';\n" +
          "</script>\n" +
          "\n" +
          "    <link rel=\"canonical\" href=\"https://www.lagou.com/gongsi/9895.html\" />\n" +
          "\n" +
          "    <link rel=\"stylesheet\" type=\"text/css\" href=\"//www.lgstatic.com/www/static/dep/mCustomScrollbar/css/mCustomScrollbar_ac2fb8b.css\" />\n" +
          "    <link rel=\"stylesheet\" type=\"text/css\" href=\"//www.lgstatic.com/www/static/pkg/layout_19d0413.css\" />\n" +
          "    <link rel=\"stylesheet\" type=\"text/css\" href=\"//www.lgstatic.com/www/static/pkg/widgets_ea16201.css\" />\n" +
          "    <link rel=\"stylesheet\" type=\"text/css\" href=\"//www.lgstatic.com/www/static/pkg/company-c/page/index/main.html_aio_739fde5.css\" />\n" +
          "</head>\n" +
          "<body>\n" +
          "    <script id=\"interviewExperiencesData\" type=\"text/html\">{\"pageSize\":5,\"start\":\"0\",\"result\":[{\"reply\":{\"id\":132931,\"interviewExperienceId\":607487,\"portrait\":\"i/image/M00/88/7D/Cgp3O1htxoeAd1fOAAAbceob6cI731.png\",\"username\":\"动动HR\",\"userId\":115803,\"companyName\":\"动动\",\"positionName\":\"HR\",\"content\":\"感谢反馈，也预祝您职场顺利。刘越\",\"type\":1,\"createTime\":\"2017-03-23 19:31:36\"},\"tagArray\":[\"面试效率高\",\"环境一般般\",\"面试官很nice\"],\"id\":607487,\"portrait\":\"i/image/M00/88/6E/Cgp3O1htrWmAHAakAAA4L7xU4d815.jpeg\",\"username\":\"赵*\",\"userId\":1997618,\"isAnonymous\":false,\"isInterview\":true,\"noInterviewReason\":\"\",\"noInterviewType\":0,\"usefulCount\":1,\"myScore\":4,\"describeScore\":3,\"interviewerScore\":4,\"companyScore\":2,\"comprehensiveScore\":3.0,\"content\":\"面试官是创始人，人很不错，很有范，思路也很清晰。但思维上有些过于传统古板，对品牌部的重视程度也偏低，不看好推广效果，有些自high。动动肯踏下心来做好产品是难能可贵的精神，需要耐得住寂寞，但在互联网产品大规模爆发的情况下，如何定位、如何进行品牌策划及传播，都是考验一个新兴品牌是否能长远的因素，还望慎重考虑。预祝动动品牌迅速成长壮大！\",\"evaluation\":\"\",\"positionId\":2788812,\"positionName\":\"品牌策划\",\"companyName\":\"动动\",\"positionType\":\"\",\"hrId\":115803,\"orderId\":4064153,\"companyId\":9895,\"replyCount\":1,\"isAllowReply\":false,\"tags\":\"[\\\"面试效率高\\\",\\\"环境一般般\\\",\\\"面试官很nice\\\"]\",\"type\":1,\"status\":1,\"source\":3,\"createTime\":\"2017-03-23 17:22:28\"},{\"tagArray\":[\"面试官很nice\",\"面试官是大牛\"],\"id\":606526,\"portrait\":\"images/jd_portrait.png\",\"username\":\"匿名\",\"userId\":2435129,\"isAnonymous\":true,\"isInterview\":true,\"noInterviewReason\":\"\",\"noInterviewType\":0,\"usefulCount\":0,\"myScore\":3,\"describeScore\":5,\"interviewerScore\":5,\"companyScore\":4,\"comprehensiveScore\":4.7,\"content\":\"面试官人挺好的，主要聊聊平时的工作及工作所得，可惜自己水平不够，遗憾。\",\"evaluation\":\"\",\"positionId\":1871752,\"positionName\":\"Android开发工程师\",\"companyName\":\"动动\",\"positionType\":\"技术\",\"hrId\":115803,\"orderId\":3874454,\"companyId\":9895,\"replyCount\":0,\"isAllowReply\":true,\"tags\":\"[\\\"面试官很nice\\\",\\\"面试官是大牛\\\"]\",\"type\":1,\"status\":1,\"source\":1,\"createTime\":\"2017-03-23 09:40:23\"},{\"tagArray\":[\"面试官很nice\"],\"id\":606095,\"portrait\":\"images/jd_portrait.png\",\"username\":\"匿名\",\"userId\":7333824,\"isAnonymous\":true,\"isInterview\":true,\"noInterviewReason\":\"\",\"noInterviewType\":0,\"usefulCount\":1,\"myScore\":3,\"describeScore\":3,\"interviewerScore\":4,\"companyScore\":4,\"comprehensiveScore\":3.7,\"content\":\"自己面试表现有好有坏。没有拿 demo，有些地方可能讲得不清楚。自己肯定还是有些不足的，只是不知被拒的具体原因。一轮就被刷了，薪资不知道怎样。\",\"evaluation\":\"\",\"positionId\":2477142,\"positionName\":\"资深Android工程师\",\"companyName\":\"动动\",\"positionType\":\"技术\",\"hrId\":115803,\"orderId\":4053583,\"companyId\":9895,\"replyCount\":0,\"isAllowReply\":true,\"tags\":\"[\\\"面试官很nice\\\"]\",\"type\":1,\"status\":1,\"source\":1,\"createTime\":\"2017-03-22 19:05:29\"},{\"tagArray\":[\"福利待遇杠杠的\",\"面试官是大牛\"],\"id\":605157,\"portrait\":\"images/jd_portrait.png\",\"username\":\"匿名\",\"userId\":2781109,\"isAnonymous\":true,\"isInterview\":true,\"noInterviewReason\":\"\",\"noInterviewType\":0,\"usefulCount\":0,\"myScore\":3,\"describeScore\":5,\"interviewerScore\":5,\"companyScore\":4,\"comprehensiveScore\":4.7,\"content\":\"公司看起来充满活力，应该适合年轻人发展，开放式的工作环境感觉比写字楼有趣多了。自己确实没有达到公司的要求，继续努力吧。\",\"evaluation\":\"\",\"positionId\":2477142,\"positionName\":\"资深Android工程师\",\"companyName\":\"动动\",\"positionType\":\"技术\",\"hrId\":115803,\"orderId\":4054502,\"companyId\":9895,\"replyCount\":0,\"isAllowReply\":true,\"tags\":\"[\\\"福利待遇杠杠的\\\",\\\"面试官是大牛\\\"]\",\"type\":1,\"status\":1,\"source\":4,\"createTime\":\"2017-03-22 12:00:10\"},{\"tagArray\":[\"面试效率高\",\"面试官是大牛\"],\"id\":603176,\"portrait\":\"i/image/M00/8B/CA/Cgp3O1h8cdeAOZi1AASn1y-g7ww987.jpg\",\"username\":\"许*\",\"userId\":6724075,\"isAnonymous\":false,\"isInterview\":true,\"noInterviewReason\":\"\",\"noInterviewType\":0,\"usefulCount\":0,\"myScore\":4,\"describeScore\":5,\"interviewerScore\":5,\"companyScore\":4,\"comprehensiveScore\":4.7,\"content\":\"首先要通过 Codility 在线测验，共三题 。第一题简单，后两道题的难度大概等于 LeetCode Medium。\\n<br />\\n<br />Onsite 面试：\\n<br />1.) 第一轮面试官是技术co-founder, 从微软出来的工程师。题目围绕我过去做过的项目，and general technical questions on back-end web development and computer networking. 没问算法。\\n<br />\\n<br />2.） 负责产品的co-founder. 介绍了动动的产品和未来规划。面试官是白人，so the interview was conducted in English.\\n<br />\\n<br />系统设计：\\n<br />onsite面试过后被安排完成一个作业：重新设计动动的一个功能。 由于我已有其他公司的offer deadline，最后决定终结动动的面试。\",\"evaluation\":\"HR友好，短信回得快。\",\"positionId\":2123044,\"positionName\":\"Server端开发\",\"companyName\":\"动动\",\"positionType\":\"技术\",\"hrId\":115803,\"orderId\":4006522,\"companyId\":9895,\"replyCount\":0,\"isAllowReply\":true,\"tags\":\"[\\\"面试效率高\\\",\\\"面试官是大牛\\\"]\",\"type\":1,\"status\":1,\"source\":1,\"createTime\":\"2017-03-20 23:06:46\"}],\"totalCount\":\"176\",\"pageNo\":1}</script>\n" +
          "    <script id=\"companyInfoData\" type=\"text/html\">{\"addressList\":[{\"id\":17573,\"companyId\":9895,\"userId\":115803,\"province\":\"北京\",\"city\":\"北京\",\"district\":\"朝阳区\",\"detailAddress\":\"工体北路四号院10号楼科技寺\",\"lat\":\"39.93241\",\"lng\":\"116.45735\",\"businessArea\":\"团结湖,三里屯,工体\",\"createTime\":\"2014-03-18 18:46:27\",\"updateTime\":\"2017-02-17 15:23:10\",\"useTime\":\"2017-02-17 15:23:10\",\"provinceCode\":\"010000000\",\"cityCode\":\"010100000\",\"districtCode\":\"010113000\",\"businessAreaCode\":\"010113032,010113010,010113080\",\"isDefault\":false,\"isEnable\":true,\"isDel\":false,\"isValid\":true}],\"labels\":[\"股票期权\",\"世界顶级团队\",\"扁平管理\",\"六险一金\",\"美国绿卡\",\"弹性工作\",\"年底双薪\",\"年度旅游\",\"定期体检\"],\"baseInfo\":{\"companyId\":9895,\"industryField\":\"移动互联网,医疗健康\",\"companySize\":\"15-50人\",\"city\":\"北京\",\"financeStage\":\"B轮\"},\"leaders\":[{\"id\":4401,\"companyid\":9895,\"photo\":\"i/image/M00/A9/2E/Cgp3O1ivrbOAeb5xAAFQq-KYfOE601.jpg\",\"name\":\"刘越\",\"position\":\"CEO\",\"weibo\":\"\",\"remark\":\"<p>美国华盛顿大学博士，原上海微创软件COO，微软中国总监，微软美国主管项目经理／软件工程师。</p>\",\"createtime\":\"2014-03-18 19:05:24\",\"isenable\":0,\"isleader\":1,\"weibonickname\":\"\",\"cyclopediaUrl\":\"\"},{\"id\":25161,\"companyid\":9895,\"photo\":\"images/leader_default.png\",\"name\":\"李磊\",\"position\":\"联合创始人\",\"weibo\":\"\",\"remark\":\"<p>美国南加州大学计算机科学硕士，原上海微创软件深圳总经理，美国微软开发工程师，2008-2010美国微软华人协会主席。</p>\",\"createtime\":\"2015-02-06 16:22:38\",\"isenable\":0,\"isleader\":1,\"weibonickname\":\"\",\"cyclopediaUrl\":\"\"},{\"id\":25162,\"companyid\":9895,\"photo\":\"image1/M00/08/7E/Cgo8PFTVnsKAbmMjAABuw6Buy_E162.jpg\",\"name\":\"Mike Caldwell\",\"position\":\"联合创始人\",\"weibo\":\"\",\"remark\":\"<p>美国杜克大学经济学、计算机科学双学士，原高朋（Groupon）中国BI经理，Carmax美国系统分析师。</p>\",\"createtime\":\"2015-02-06 16:27:40\",\"isenable\":0,\"isleader\":1,\"weibonickname\":\"\",\"cyclopediaUrl\":\"\"}],\"userType\":false,\"history\":[{\"id\":127535,\"companyid\":9895,\"year\":\"2016\",\"month\":\"July\",\"day\":\"14\",\"eventtype\":\"产品\",\"type\":\"4\",\"eventdate\":\"2016-07-14\",\"eventname\":\"刘越：一切“融资-烧钱-再融资”的模式都是伪命题\",\"eventurl\":\"http://mt.sohu.com/20160713/n459133051.shtml\",\"eventprofile\":\"\",\"financeStage\":\"\"},{\"id\":127534,\"companyid\":9895,\"year\":\"2016\",\"month\":\"June\",\"day\":\"30\",\"eventtype\":\"产品\",\"type\":\"4\",\"eventdate\":\"2016-06-30\",\"eventname\":\"计步健康管理App——动动，收获全球5000万用户\",\"eventurl\":\"http://toutiao.com/i6300759431927824898/?wxshare_count=3&amp;pbid=20235212299&amp;from=groupmessage&amp;isappinstalled=0\",\"eventprofile\":\"\",\"financeStage\":\"\"},{\"id\":67867,\"companyid\":9895,\"year\":\"2015\",\"month\":\"Mar\",\"day\":\"31\",\"eventtype\":\"其他\",\"type\":\"5\",\"eventdate\":\"2015-03-31\",\"eventname\":\"率先适配apple watch的动动app即将上线\",\"eventurl\":\"http://www.prnasia.com/story/archive/1367595_ZH67595_1\",\"eventprofile\":\"\",\"icon\":\"\",\"financeStage\":\"\"},{\"id\":61091,\"companyid\":9895,\"year\":\"2015\",\"month\":\"Jan\",\"day\":\"01\",\"eventtype\":\"其他\",\"type\":\"5\",\"eventdate\":\"2015-01-01\",\"eventname\":\"动动：低调的国产世界Top10健康应用\",\"eventurl\":\"http://www.vcbeat.net/9254.html?from=timeline&amp;isappinstalled=0\",\"eventprofile\":\"\",\"icon\":\"\",\"financeStage\":\"\"},{\"id\":61089,\"companyid\":9895,\"year\":\"2014\",\"month\":\"Sept\",\"day\":\"24\",\"eventtype\":\"其他\",\"type\":\"5\",\"eventdate\":\"2014-09-24\",\"eventname\":\"在可穿戴市场，别人忙着承包池塘，他们专做打渔工\",\"eventurl\":\"http://www.ifanr.com/455326\",\"eventprofile\":\"\",\"icon\":\"\",\"financeStage\":\"\"}],\"pageType\":1,\"coreInfo\":{\"companyId\":9895,\"logo\":\"image1/M00/0F/98/CgYXBlT9VTyAPrkpAABxT0Jk37g742.png\",\"companyName\":\"北京慢点生活科技有限公司\",\"companyShortName\":\"动动\",\"approve\":2,\"companyUrl\":\"http://www.dongdong.ba\",\"companyIntroduce\":\"用户最多的运动健康APP\",\"isFirst\":false},\"dataInfo\":{\"positionCount\":15,\"resumeProcessRate\":99,\"resumeProcessTime\":1,\"experienceCount\":176,\"lastLoginTime\":\"今天\"},\"companyId\":9895,\"products\":[{\"id\":4769,\"companyid\":9895,\"producturl\":\"http://itunes.apple.com/cn/app/dong-dong-yun-dong-jian-fei/id525701980?l=en&amp;mt=8\",\"productprofile\":\"运动健康首选，健走跑步减肥教练。\\n<br />Appstore中国、美国、欧洲健康健美分类均稳定排名前三。\\n<br />Android平台，获豌豆荚2014年年度优秀应用设计奖、小米应用市场金米奖。\",\"product\":\"动动\",\"productpicurl\":\"image1/M00/0F/61/Cgo8PFT9JN6APAjEAAXDrL1Cg3o664.png\"},{\"id\":16410,\"companyid\":9895,\"producturl\":\"\",\"productprofile\":\"Appstore美国、欧洲均排名前三的移动健康应用，超过Nike。\\n<br />多次获Appstore首页推荐，WWDC2014展示应用。AppleWatch全球首批第三方应用。\",\"product\":\"Pacer（动动国际版）\",\"productpicurl\":\"image1/M00/0D/2A/Cgo8PFT26m-AXpgIAAD_dur0pK0918.png\"},{\"id\":16412,\"companyid\":9895,\"producturl\":\"\",\"productprofile\":\"Diabetes Pacer\\n<br />最早最优秀的糖尿病管理应用。一直被模仿，从未被超越。\\n<br />给全世界的糖友提供移动方式来管理糖尿病，更方便更快捷更专业。\\n<br />\",\"product\":\"糖友动动\",\"productpicurl\":\"image1/M00/0D/0F/Cgo8PFT2vPuAN5_lAADfa5g9VbI052.png\"}],\"introduction\":{\"companyId\":9895,\"companyProfile\":\"<p>我们是北京荣誉出品的动动/Pacer，我们致力于用技术的手段来帮助全世界的普通人享受到健康并富有活力的生活。<br /></p>\\n<p class=\\\"p1\\\">动动是目前全球唯一一款在AppStore健康分类始终排名前5的应用，AppleWatch全球首批第三方应用。动动全球用户超过5000万，其中欧美用户超过2700万，目前已经稳定盈利，成为行业内少有的全球化及商业化案例。我们以创造最大价值为原则，鼓励并培养每个成员在创造用户价值的同时实现自我价值与回报。</p>\\n<p>我们有世界上最好的团队，我们共同的目标是通过做成一件对社会有价值的事情，来成就最好的自己。我们坚持以创造价值为首要任务，并坚信收益会随之而来。我们以团队的中长期利益最大化为原则，兼顾团队每一位成员的工作成果与努力过程的平衡，以及新老员工在公司发展不同时间阶段贡献的平衡。<br /></p>\\n<p>如果你也有同样的热情，认同我们的价值观，那么不妨一试，接受更有挑战的工作，与我们一起创造移动健康领域的无限可能。</p>\",\"pictures\":[{\"id\":170445,\"companyId\":9895,\"companyPicUrl\":\"i/image/M00/4A/9F/CgqKkVebHPqAWJwUAADRnwj3vJ8657.png\",\"position\":1,\"createTime\":\"2016-07-29 17:08:24\",\"updateTime\":\"2016-10-20 14:54:45\",\"isdel\":false},{\"id\":170446,\"companyId\":9895,\"companyPicUrl\":\"i/image/M00/4A/9F/Cgp3O1ebHQWAJf8eAACZ2OuYwjo906.png\",\"position\":0,\"createTime\":\"2016-07-29 17:08:24\",\"updateTime\":\"2016-10-20 14:54:45\",\"isdel\":false},{\"id\":196759,\"companyId\":9895,\"companyPicUrl\":\"i/image/M00/63/E3/Cgp3O1gEPTSAHOhjABFwZuTpLtg957.jpg\",\"position\":0,\"createTime\":\"2016-10-17 10:54:03\",\"updateTime\":\"2016-10-20 14:54:45\",\"isdel\":false}]},\"isCompanyHr\":false}</script>\n" +
          "\n" +
          "    \n" +
          "    \t<!--C端头部通栏广告位-->\n" +
          "<script type=\"text/javascript\" src=\"//www.lgstatic.com/www/static/pkg/lg-analytics_da6a007.js\"></script>\n" +
          "<script type=\"text/javascript\" src=\"https://www.lagou.com/upload/oss.js\"></script></body>\n" +
          "</html>\n";
}
