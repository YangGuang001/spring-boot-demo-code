package com.springboot.example.first.service;

import com.springboot.example.first.dao.PersonRepository;
import com.springboot.example.first.dao.PersonsDao;
import com.springboot.example.first.entity.Person;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by yz on 2017/12/16.
 */
@Service
public class PersonService {

    @Resource
    private PersonRepository personRepository;

    @Resource
    private PersonsDao personsDao;

    @Transactional
    public void save(Person person) {
        personRepository.save(person);
    }

    public Person getById(int id) {
        return personsDao.getById(id);
    }
}
