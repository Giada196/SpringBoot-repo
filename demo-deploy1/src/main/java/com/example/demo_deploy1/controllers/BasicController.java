package com.example.demo_deploy1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/devName")
public class BasicController {

    @GetMapping
    public String devName(){
        return "Giada";
    }
}
