package com.springboot.example.first.controller;



import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by yz on 2017/12/17.
 */
@org.springframework.stereotype.Controller
public class TemplateController {

    @RequestMapping("/hello")
    public String helloHtml(Map<String, Object> map) {
        map.put("hello", "hello world");
        return "hello";
    }
}
