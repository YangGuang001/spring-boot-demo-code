package com.springboot.example.first.dao;

import com.springboot.example.first.entity.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yz on 2017/12/16.
 */
@Repository
public class PersonDao {

    private static List<Person> personList;

    static {
        personList = new ArrayList<>();
        personList.add(new Person(1, "yang", 18));
        personList.add(new Person(2, "xin", 18));
        personList.add(new Person(3, "zhao", 19));
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public Person getPerson(int id) {
        for (Person person : personList) {
            if (id == person.getId()) {
                return person;
            }
        }
        return null;
    }
}
