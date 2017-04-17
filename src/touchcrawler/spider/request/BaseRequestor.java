package touchcrawler.spider.request;

import net.sf.json.JSONObject;

/**
 * Created by xiao on 2017/4/13.
 */
abstract public class BaseRequestor {
    private JSONObject header;
    private String url;

    abstract public Object request();

    abstract public String getStatus();

    abstract public void configRequest();

    abstract public void setHeaders(JSONObject header);

    public void setUrl(String url) {
        this.url = url;
    }
}
