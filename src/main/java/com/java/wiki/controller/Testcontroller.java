package com.java.wiki.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
public class Testcontroller {
    @GetMapping("/hello")
    public String hello(){
        return "Hello World!";
    }


    @PostMapping("/hello/post")
    public String helloPost(String name){
        return "Hello world!Post,"+name;
    }
}
