package com.springboot.bookdemo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.nio.charset.Charset;

/**
 * Created by yz on 2017/12/24.
 */
@ConfigurationProperties(prefix = "spring.http.encoding")
public class HttpEncodingProperties {
    public static final Charset DEFAULT_CHARSET = Charset.forName("UTF-8");

    public Charset charset = DEFAULT_CHARSET;

    private boolean force = true;

    public Charset getCharset() {
        return charset;
    }

    public void setCharset(Charset charset) {
        this.charset = charset;
    }

    public boolean isForce() {
        return force;
    }

    public void setForce(boolean force) {
        this.force = force;
    }
}
