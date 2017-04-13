package touchcrawler.spider.request;

import net.sf.json.JSONObject;

/**
 * Created by xiao on 2017/4/13.
 */
abstract public class BaseRequestor {
    abstract public Object request();

    abstract public void setHeaders(String headerStr);

    abstract public void configRequest();

    private JSONObject headers;
}
