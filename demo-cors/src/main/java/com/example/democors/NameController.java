package com.example.democors;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = {"http://localhost:8080"})
public class NameController {
    @GetMapping("/nome")
    public String nome (@RequestParam(required = true) String name) {
        return name;
    }
    @PostMapping("/reverse")
    public String reverse(@RequestParam String name){
        StringBuilder reversename = new StringBuilder(name).reverse();
        return reversename.toString();
    }
}

