package com.security.SecurityDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {


    @GetMapping("/hello")
    public String getHello(){
        return "Hello";
    }

}
