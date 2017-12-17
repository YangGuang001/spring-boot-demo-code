package com.springboot.example.first.dao;

import com.springboot.example.first.entity.Person;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by yz on 2017/12/16.
 */
@Repository
public class PersonsDao {

    @Resource
    private JdbcTemplate jdbcTemplate;

//    public void savePerson() {
//
//    }
    public Person getById(int id) {
        String sql = "select * from person where id=?";
        RowMapper<Person> rowMapper = new BeanPropertyRowMapper<>(Person.class);
        return jdbcTemplate.queryForObject(sql, rowMapper, id);
    }
}
