package com.example.authentication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping
    public String api() {
        return "api";
    }

    @GetMapping("/admin")
    public String apiAdmin() {
        return "api admin";
    }
}