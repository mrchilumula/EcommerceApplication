package com.example.ecommerce;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class sample {
    @GetMapping
    public String foo() {
        return "WELCOME" +
                "TO" +  "E-COMMERCE" + "APPLICATION"    ;
    }
}
