package spider.touchcrawler;
import spider.touchcrawler.request.*;
import java.util.Properties;

/**
 * Used for send http request and get data from the website
 * Created by xiao on 2017/4/12.
 */
public class WebRequestor {
  public WebRequestor(Class<?> requestorClass,Properties header) {
    try{
      this.request=(ICrawlerRequest)requestorClass.newInstance();
    }catch (Exception e){
      System.out.println(e.getMessage());
    }
    this.header=header;
    this.url=url;
  }

  public void setUrl(String url){
    this.url=url;
  }

  public String getUrl(){
    return this.url;
  }

  public void setHeader(Properties header){
    this.header=header;
  }

  public Properties getHeader(){
    return this.header;
  }

  public void setHeader(String key, String value){
    this.header.setProperty(key,value); 
  }

  private String url;
  private ICrawlerRequest request;
  private Properties header;
}
