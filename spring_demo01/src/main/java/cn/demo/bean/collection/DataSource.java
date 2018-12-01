package cn.demo.bean.collection;

import java.util.Properties;

/**
 * @author laoganbu
 * @date: 2018/11/27 22:36
 */
public class DataSource {

    private Properties properties;

    @Override
    public String toString() {
        return "DataSource{" +
                "properties=" + properties +
                '}';
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
