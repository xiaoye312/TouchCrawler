package touchcrawler;

import touchcrawler.spider.AnalyzerDispatcher;
import touchcrawler.spider.RequestDispatcher;
import touchcrawler.utils.CrawllerConfig;

import java.util.LinkedList;
import java.util.Vector;


/**
 * Created by xiao on 2017/4/18.
 */
public class TouchCrawler {
    private CrawllerConfig requestorConfig;
    private CrawllerConfig analyzerConfig;
    private CrawllerConfig databaseConfig;
    private LinkedList<String> urlList; //url need to be crawled

    //Performed as controller to decide what and how to crawl
    public TouchCrawler(String configsPath) {
        //TODO
    }

    public TouchCrawler(String requestorPath, String analyzerConfig, String databaseConfig) {
        //TODO
    }

    public void crawl(Class<?> requestClass, Class<?> analyzerClass) {
        //TODO
        RequestDispatcher requestDispatcher = new RequestDispatcher(requestClass);
        //requestDispatcher.setRequestor(url,header,requestconfig);
        AnalyzerDispatcher analyzerDispatcher = new AnalyzerDispatcher(analyzerClass);
        //analyzerDispatcher.setAnalyzer(webcontent,analyzerConfig);

    }

    public void wait(float interval) {
        //TODO
    }

    public String getNextUrl() {
        //TODO
    }

    public void addElement() {
        //TODO
    }

    public void deleteElement() {
        //TODO
    }

    public boolean isExisted() {
        //TODO
    }

    public void updateUrlList(Vector urls) {
        //TODO
    }

}
