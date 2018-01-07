package com.springmvc.demo.one;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yz on 2017/12/23.
 */
@Controller
public class HelloController {

    @RequestMapping("/index")
    public String hello() {
        return "index";
    }
}
