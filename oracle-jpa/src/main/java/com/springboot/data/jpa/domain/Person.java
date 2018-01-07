package com.springboot.data.jpa.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

/**
 * Created by yz on 2018/1/2.
 */
@Entity
@Data
@NamedQuery(name = "Person.withNameAndAddressNamedQuery", query = "select p from Person p where p.name=:name and p.address = :address")
public class Person {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private Integer age;

    private String address;

    public Person() {

    }

    public Person(Long id, String name, Integer age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }
}
