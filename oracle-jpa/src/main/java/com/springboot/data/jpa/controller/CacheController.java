package com.springboot.data.jpa.controller;

import com.springboot.data.jpa.domain.DemoService;
import com.springboot.data.jpa.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yz on 2018/1/3.
 */
@RestController
public class CacheController {

    @Autowired
    DemoService demoService;

    @RequestMapping("/put")
    public Person put(Person person) {
        return demoService.save(person);
    }


    @RequestMapping("/delete")
    public String delete(Person person) {
        demoService.remove(person.getId());
        return "OK";
    }

    @RequestMapping("/able")
    public Person able(Person person) {
        return demoService.findOne(person);
    }
}
