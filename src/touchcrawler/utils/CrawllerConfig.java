package touchcrawler.utils;

import org.apache.commons.configuration2.PropertiesConfiguration;

/**
 * Created by xiao on 2017/4/17.
 */
public class CrawllerConfig {
    private PropertiesConfiguration configs;

    public CrawllerConfig(String configFilePath) {
        this.configs = new PropertiesConfiguration();
        //TODO: read configs from files;
    }

    public void updateConfigs(String key, Object value) {
        this.configs.setProperty(key, value);
    }

    public String getProperity(String item) {
        return configs.getString(item, "NULL");
    }

}
