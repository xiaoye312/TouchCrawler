package touchcrawler.spider.request;

import net.sf.json.JSONObject;
import touchcrawler.utils.CrawllerConfig;

/**
 * Created by xiao on 2017/4/13.
 */
abstract public class BaseRequestor {
    private JSONObject header;
    private String url;
    private CrawllerConfig requestConfigs;

    abstract public Object request();

    abstract public String getStatus();

    abstract public void configRequest(); //TODO: set request configs followed by requestConfig

    abstract public void setHeaders(JSONObject header);

    public void setUrl(String url) {
        this.url = url;
    }

    public void setRequestConfigs(CrawllerConfig config) {
        this.requestConfigs = config;
    }
}
