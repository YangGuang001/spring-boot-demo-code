package com.springboot.data.jpa.service;

import com.springboot.data.jpa.dao.PersonRepository;
import com.springboot.data.jpa.domain.DemoService;
import com.springboot.data.jpa.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Created by yz on 2018/1/3.
 */
@Service
public class DemoSerivceImp implements DemoService {

    @Autowired
    PersonRepository personRepository;

    @Override
    @CachePut(value = "person", key = "#person.id")
    public Person save(Person person) {
        Person p = personRepository.save(person);
        System.out.println("id : " + p.getId() + " value: " + p.getName());
        return p;
    }

    @Override
    @CacheEvict(value = "person")
    public void remove(Long id) {
        System.out.println("id : " + id );
        personRepository.delete(id);
    }

    @Override
    @Cacheable(value = "person", key = "#person.id")
    public Person findOne(Person person) {
        Person p = personRepository.findOne(person.getId());
        System.out.println("id : " + p.getId() + " value: " + p.getName());
        return p;
    }
}
