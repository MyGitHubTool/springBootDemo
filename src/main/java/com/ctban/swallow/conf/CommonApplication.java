package com.ctban.swallow.conf;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author GuoJie 2018/7/4 17:21
 */
@Component
@PropertySource("classpath:application-common.properties")
@ConfigurationProperties(prefix = "user")
public class CommonApplication {

    private String name;

    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
