package touchcrawler.spider.Analyer;

import touchcrawler.utils.CrawllerConfig;

import java.util.HashMap;

/**
 * Created by xiao on 2017/4/17.
 */
abstract public class BaseAnalyzer {
    private Object webContent;
    private CrawllerConfig analysisConfig;

    abstract public HashMap analysis(); //TODO: implement in sub-classes, how to get data you wanted according to CrawlConfig

    abstract public void setWebContent(Object webContent);

    public void setAnalysisConfig(CrawllerConfig analysisConfig) {
        this.analysisConfig = analysisConfig;
    }
}
