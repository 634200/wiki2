package com.java.wiki.controller;

import com.java.wiki.mapper.EbookNameMapper;
import com.java.wiki.pojo.EbookName;
import com.java.wiki.req.EbookNameReq;
import com.java.wiki.resp.CommonResp;
import com.java.wiki.resp.EbookNameResp;
import com.java.wiki.service.EbookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/ebook")
public class EbookController {

    @Resource
    private EbookService ebookService;

    @GetMapping("/list")
    public CommonResp list(EbookNameReq req) {
        CommonResp<List<EbookNameResp>> resp = new CommonResp<>();
        List<EbookNameResp> list = ebookService.list(req);
        resp.setContent(list);
        return resp;
    }
}
