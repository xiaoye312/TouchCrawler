package touchcrawler.spider;

import touchcrawler.spider.request.BaseRequestor;

/**
 * Used for send http request and get data from the website
 * Created by xiao on 2017/4/12.
 */
public class RequestDispatcher {
  public RequestDispatcher(Class<?> requestor, String url) {
    try{
      this.requestor = (BaseRequestor) requestor.newInstance();
    }catch (Exception e){
      System.out.println(e.getMessage());
    }
    this.url=url;
  }

  public Object request() {
    return this.requestor.request();
  }
  public void setUrl(String url){
    this.url=url;
  }
  public String getUrl(){
    return this.url;
  }

  public void setRequestor(String header) {
    //TODO  set url&headers,etc.
  }
  private String url;
  private BaseRequestor requestor;
}
