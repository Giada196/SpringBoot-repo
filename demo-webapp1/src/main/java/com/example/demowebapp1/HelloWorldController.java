package com.example.demowebapp1;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v2")
public class HelloWorldController {
    @GetMapping(path = "/ciao/{provincia}")
    public Saluti greet (@PathVariable String provincia,
                          @RequestParam (required = true) String nome,
                          @RequestParam(required = false, defaultValue = "Ciao Giuseppe, com'è il tempo in Lombardia?")
                             String saluto)
    { return new Saluti(nome, provincia, saluto);
    }
}
