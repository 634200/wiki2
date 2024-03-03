package com.java.wiki.controller;


import com.java.wiki.domain.CstCustomer;
import com.java.wiki.mapper.CustMapper;
import com.java.wiki.mapper.DemoNameMapper;
import com.java.wiki.pojo.DemoName;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


@RestController
@RequestMapping("/demo")
public class DemoController {

    @Resource
    private DemoNameMapper demoNameMapper;

    @GetMapping("/list")
    public List<DemoName> list() {
        return demoNameMapper.selectByExample(null);
    }
}
