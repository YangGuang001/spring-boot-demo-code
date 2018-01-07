package com.springboot.demo.autoconfiguration;

/**
 * Created by yz on 2017/12/18.
 */
public class HelloService {

    private String msg = "service";

    public String say() {
        return "hello " + msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
