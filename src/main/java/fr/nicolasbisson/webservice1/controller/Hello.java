package fr.nicolasbisson.webservice1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping(value = "/")
    public String hello() {
        return "hello";
    }

}
