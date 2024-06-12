package com.example.environment2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/msg")
public class BasicController {

    @Autowired
    private Environment environment;

    @GetMapping
    public String message(){
        String environmentmessage = environment.getProperty("welcomeMsg");
        return environmentmessage;
    }
}
