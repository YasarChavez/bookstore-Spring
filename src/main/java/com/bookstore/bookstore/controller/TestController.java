package com.bookstore.bookstore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

@RestController

public class TestController {
    

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/test")
    public String test() {
        try {
            String sql = "SELECT * FROM BOOK";
            
            return jdbcTemplate.queryForList(sql).toString();
        } catch (Exception e) {
            return "fail " + e.getMessage();
        }
    }

}
