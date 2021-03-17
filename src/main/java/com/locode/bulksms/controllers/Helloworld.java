package com.locode.bulksms.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloworld {

    @GetMapping("/")
    public String getGreeting(){
        return "Hello Worlds";
    }
}
