package com.springboot.data.jpa.domain;

/**
 * Created by yz on 2018/1/3.
 */
public interface DemoService {
    public Person save(Person person);

    public void remove(Long id);

    public Person findOne(Person person);
}
