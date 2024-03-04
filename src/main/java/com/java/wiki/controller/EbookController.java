package com.java.wiki.controller;


import com.java.wiki.mapper.EbookNameMapper;
import com.java.wiki.pojo.EbookName;
import com.java.wiki.resp.CommonResp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


@RestController
@RequestMapping("/ebook")
public class EbookController {

    @Resource
    private EbookNameMapper ebookNameMapper;

    @GetMapping("/list")
    public CommonResp list() {
        CommonResp<List<EbookName>> resp = new CommonResp<>();
        List<EbookName> list = ebookNameMapper.selectByExample(null);
        resp.setContent(list);
        return resp;
    }
}
