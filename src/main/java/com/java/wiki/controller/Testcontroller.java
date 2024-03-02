package com.java.wiki.controller;


import com.java.wiki.domain.CstCustomer;
import com.java.wiki.mapper.CustMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;


@RestController
public class Testcontroller {
    @Value("$test.hello=Hello")
    private String testHello;

    @Resource
    private CustMapper mapper;

    @GetMapping("/hello")
    public String hello(){
        return "Hello World!" + testHello;
    }
    @PostMapping("/hello/post")
    public String helloPost(String name){
        return "Hello world!Post,"+name;
    }

    @GetMapping("/list")
    public List<CstCustomer> list() {
        return mapper.list();
    }
}
