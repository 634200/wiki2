package com.java.wiki.service;

import com.java.wiki.mapper.DemoNameMapper;
import com.java.wiki.pojo.DemoName;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service

public class DemoService {
    @Resource
    private DemoNameMapper demoMapper;

    public List<DemoName> list() {
        return demoMapper.selectByExample(null);
    }
}
