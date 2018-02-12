package com.springboot.example.first.controller;

import com.springboot.example.first.dao.PersonDao;
import com.springboot.example.first.entity.Person;
import com.springboot.example.first.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private PersonDao personDao;

    @Autowired
    private PersonService personService;

    @RequestMapping("/")
    public String hello() {
        return "Hello world";
    }

//    @RequestMapping("/getPerson/{id}")
//    public Person getPerson(@PathVariable("id") int id) {
//        return personDao.getPerson(id);
//    }

    @RequestMapping("/getException")
    public int getException() {
        return 100/0;
    }

    @RequestMapping("/savePerson")
    public void savePerson() {
        Person person = new Person(1, "dddd", 18);
        personService.save(person);
    }

    @RequestMapping("/getPerson/{id}")
    public Person getPerson(@PathVariable("id") int id) {
        return personService.getById(id);
    }
}