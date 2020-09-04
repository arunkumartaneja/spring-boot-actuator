package com.example.actuator.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Value("${spring.profiles}")
    private String profile;

    @GetMapping("/")
    public String hello() {
        return "hello " + profile;
    }

}
