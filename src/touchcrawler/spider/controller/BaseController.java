package touchcrawler.spider.controller;

import touchcrawler.utils.CrawllerConfig;

/**
 * Created by xiao on 2017/4/17.
 */
abstract public class BaseController {
    private CrawllerConfig configs;

    abstract public void crawling(String configFiles);

    abstract public void configAnalyzer();

    abstract public void configRequestor();
}
