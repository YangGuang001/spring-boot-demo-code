package com.springboot.data.jpa.controller;

import com.springboot.data.jpa.dao.PersonRepository;
import com.springboot.data.jpa.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by yz on 2018/1/2.
 */
@RestController
public class DataController {

    @Autowired
    PersonRepository personRepository;

    @RequestMapping("/save")
    public Person save(String name, String address, Integer age) {
        Person p = personRepository.save(new Person(null, name, age, address));
        return p;
    }

    @RequestMapping("/ql")
    public List<Person> ql(String address) {
        List<Person> personList = personRepository.findByAddress(address);
        return personList;
    }

    @RequestMapping("/q2")
    public Person q2(String address, String name) {
        Person person = personRepository.findByNameAndAddress(name, address);
        return person;
    }

    @RequestMapping("/q3")
    public Person q3(String address, String name) {
        Person person = personRepository.withNameAndAddressQuery(name, address);
        return person;
    }

    @RequestMapping("/q4")
    public Person q4(String address, String name) {
        Person person = personRepository.withNameAndAddressNamedQuery(name, address);
        return person;
    }

    @RequestMapping("/sort")
    List<Person> sort() {
        List<Person> personList = personRepository.findAll(new Sort(Sort.Direction.ASC, "age"));
        return personList;
    }

    @RequestMapping("/page")
    public Page<Person> page() {
        Page<Person> personList = personRepository.findAll(new PageRequest(1, 2));
        return personList;
    }
}
