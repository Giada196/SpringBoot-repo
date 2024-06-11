package com.example.demo_deploy2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/sum")
public class BasicController {

    @GetMapping
    public Integer Random (){
        Random randomsum = new Random();
        Integer random = randomsum.nextInt(1000) ;
        Integer random2 = randomsum.nextInt(1000);
        return random + random2;
    }
}
