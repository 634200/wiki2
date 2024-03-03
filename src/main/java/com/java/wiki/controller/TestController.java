package com.java.wiki.controller;


import com.java.wiki.domain.CstCustomer;
import com.java.wiki.mapper.CustMapper;
import com.java.wiki.mapper.TestsNameMapper;
import com.java.wiki.pojo.TestsName;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


@RestController
public class TestController {
    @Value("$test.hello=Hello")
    private String testHello;

    @Resource
    private TestsNameMapper testsNameMapper;


    @GetMapping("/list")
    public List<TestsName> list() {
        return testsNameMapper.selectByExample(null);
    }
}
