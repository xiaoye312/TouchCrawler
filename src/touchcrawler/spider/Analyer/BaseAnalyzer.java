package touchcrawler.spider.Analyer;

import java.util.HashMap;

/**
 * Created by xiao on 2017/4/17.
 */
abstract public class BaseAnalyzer {
    private Object webContent;

    abstract public HashMap analysis();

    abstract public void setWebContent(Object webContent);
}
