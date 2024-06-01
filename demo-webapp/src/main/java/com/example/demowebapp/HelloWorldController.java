package com.example.demowebapp;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class HelloWorldController {
    @GetMapping(path = "/ciao/{id}")
    public String ciao(@PathVariable long id,
                       @RequestParam (required = true)String nome,
                       @RequestParam(required = false, defaultValue = "Fiorito") String cognome){
        return "Ciao " + nome  + " id = " + id + cognome;
    }
}
