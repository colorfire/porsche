package io.colorfire.spider.crawler;


import edu.uci.ics.crawler4j.crawler.CrawlConfig;
import edu.uci.ics.crawler4j.crawler.CrawlController;
import edu.uci.ics.crawler4j.fetcher.PageFetcher;
import edu.uci.ics.crawler4j.robotstxt.RobotstxtConfig;
import edu.uci.ics.crawler4j.robotstxt.RobotstxtServer;

/**
 * @author colorfire on 17/3/25
 */
public class Controller {

  public static void main(String[] args) throws Exception {

    String crawlStorageFolder = "/Users/weigangqiu/data/crawl/zhaopin/";
    int numberOfCrawlers = 7;

    CrawlConfig config = new CrawlConfig();
    config.setIncludeHttpsPages(true);
    config.setCrawlStorageFolder(crawlStorageFolder);
    config.setMaxDepthOfCrawling(3); // crawl depth
    config.setPolitenessDelay(500);
    config.setUserAgentString("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/56.0.2924.87 Safari/537.36");
//    config.setResumableCrawling(true); // daemon thread

        /*
         * Instantiate the controller for this crawl.
         */
    PageFetcher pageFetcher = new PageFetcher(config);
    RobotstxtConfig robotstxtConfig = new RobotstxtConfig();
    RobotstxtServer robotstxtServer = new RobotstxtServer(robotstxtConfig, pageFetcher);
    CrawlController controller = new CrawlController(config, pageFetcher, robotstxtServer);

        /*
         * For each crawl, you need to add some seed urls. These are the first
         * URLs that are fetched and then the crawler starts following links
         * which are found in these pages
         */
    controller.addSeed("https://www.lagou.com/gongsi/2-0-0");

        /*
         * Start the crawl. This is a blocking operation, meaning that your code
         * will reach the line after this only when crawling is finished.
         */
    controller.start(MyCrawler.class, numberOfCrawlers);
  }
}
