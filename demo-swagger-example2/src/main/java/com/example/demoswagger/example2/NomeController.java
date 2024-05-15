package com.example.demoswagger.example2;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
    public class NomeController {
    @Operation(summary = "getNome", description = "restituisce il nome (name) fornito")
    @GetMapping("/nome")
    public String nome(
        @Parameter(description = "nome (name) da restituire") @RequestParam String name){
        return name;
    }
    @Operation(summary = "reverse", description = "restituisce il nome (name) al contrario")
        @PostMapping("/reverse")
        public String reverse (
            @Parameter(description = "nome (name) ritorna al contrario") @RequestParam String name){
        StringBuilder reversename = new StringBuilder(name).reverse();
        return reversename.toString();
    }
    }