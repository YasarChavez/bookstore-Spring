package com.bookstore.bookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class BookController {
    @GetMapping("/")
    public String home() {
        return "home";
    }
    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
