package com.java.wiki.service;


import com.java.wiki.mapper.EbookNameMapper;
import com.java.wiki.pojo.EbookName;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service

public class EbookService {
    @Resource
    private EbookNameMapper ebookMapper;

    public List<EbookName> test() {
        return ebookMapper.selectByExample(null);
    }
}
