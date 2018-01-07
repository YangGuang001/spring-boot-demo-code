package com.springboot.demo.autoconfiguration;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by yz on 2017/12/18.
 */
@ConfigurationProperties(prefix = "hello")
public class HelloProperties {

    private String msg = "world";

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
