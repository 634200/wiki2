package com.java.wiki.controller;

import com.java.wiki.req.EbookNameQueryReq;
import com.java.wiki.req.EbookNameSaveReq;
import com.java.wiki.resp.CommonResp;
import com.java.wiki.resp.EbookNameResp;
import com.java.wiki.resp.PageResp;
import com.java.wiki.service.EbookService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

@RestController
@RequestMapping("/ebook")
public class EbookController {

    @Resource
    private EbookService ebookService;

    @GetMapping("/list")
    public CommonResp list(@Valid EbookNameQueryReq req) {
        CommonResp<PageResp<EbookNameResp>> resp = new CommonResp<>();
        PageResp<EbookNameResp> list = ebookService.list(req);
        resp.setContent(list);
        return resp;
    }

    @PostMapping("/save")
    public CommonResp save(@RequestBody EbookNameSaveReq req) {
        CommonResp resp = new CommonResp<>();
        ebookService.save(req);
        return resp;
    }

    @DeleteMapping("/delete/{id}")
    public CommonResp delete(@PathVariable Long id) {
        CommonResp resp = new CommonResp<>();
        ebookService.delete(id);
        return resp;
    }
}
