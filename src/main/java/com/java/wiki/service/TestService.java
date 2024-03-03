package com.java.wiki.service;


import com.java.wiki.mapper.TestsNameMapper;
import com.java.wiki.pojo.TestsName;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service

public class TestService {
    @Resource
    private TestsNameMapper testsMapper;

    public List<TestsName> test() {
        return testsMapper.selectByExample(null);
    }
}
