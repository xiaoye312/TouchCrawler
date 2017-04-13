package spider.touchcrawler.request;
import java.util.Properties;

/**
 * Web Requst Interface
 * Created by xiao on 2017/4/13.
 */
public interface ICrawlerRequest{
   public Object request(String url, Properties properties);
}
