package touchcrawler.spider;

import touchcrawler.spider.Analyer.BaseAnalyzer;
import touchcrawler.utils.CrawllerConfig;

import java.util.HashMap;

/**
 * Used for analysis and process web page
 * Created by xiao on 2017/4/12.
 */
public class AnalyzerDispatcher {
    private BaseAnalyzer analyzer;

    public AnalyzerDispatcher(Class<?> analyzer) {
        try {
            this.analyzer = (BaseAnalyzer) analyzer.newInstance();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public HashMap analysis() {
        return this.analyzer.analysis();
    }

    public void setAnalyzer(Object webContent, CrawllerConfig config) {
        this.analyzer.setWebContent(webContent);
        this.analyzer.setAnalysisConfig(config);
    }
}
