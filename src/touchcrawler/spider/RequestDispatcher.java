package touchcrawler.spider;

import net.sf.json.JSONObject;
import touchcrawler.spider.request.BaseRequestor;
/**
 * Used for send http request and get data from the website
 * Created by xiao on 2017/4/12.
 */
public class RequestDispatcher {
  private BaseRequestor requestor;

  public RequestDispatcher(Class<?> requestor) {
    try{
      this.requestor = (BaseRequestor) requestor.newInstance();
    }catch (Exception e){
      System.out.println(e.getMessage());
    }
  }

  public Object request() {
    return this.requestor.request();
  }

  public String getStatus() {
    return this.requestor.getStatus();
  }

  public void setRequestor(String url, JSONObject header) {
    this.requestor.setHeaders(header);
    this.requestor.setUrl(url);
    this.requestor.configRequest();
  }
}
