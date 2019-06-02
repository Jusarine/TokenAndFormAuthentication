package com.example.authentication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

    @GetMapping("/")
    public String app() {
        return "index";
    }

    @GetMapping("/user")
    public String appUser() {
        return "user";
    }
}