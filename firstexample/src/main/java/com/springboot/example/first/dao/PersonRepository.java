package com.springboot.example.first.dao;

import com.springboot.example.first.entity.Person;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Table;

/**
 * Created by yz on 2017/12/16.
 */
@Repository
@Table(name = "person")
@Qualifier("personRepository")
public interface PersonRepository extends CrudRepository<Person, Long> {
    public Person save(Person person);
}
