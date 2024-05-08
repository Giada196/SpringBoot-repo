package com.example.demoswagger.example2;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
    public class NomeController {
        @GetMapping("/nome")
        public String nome (@RequestParam( required = true) String name) {
            return name;
        }
        @PostMapping("/reverse")
        public String reverse(@RequestParam String name){
            StringBuilder reversename = new StringBuilder(name).reverse();
            return reversename.toString();
        }
}
