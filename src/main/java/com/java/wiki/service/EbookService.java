package com.java.wiki.service;


import com.java.wiki.mapper.EbookNameMapper;
import com.java.wiki.pojo.EbookName;
import com.java.wiki.pojo.EbookNameExample;
import com.java.wiki.req.EbookNameReq;
import com.java.wiki.resp.EbookNameResp;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service

public class EbookService {
    @Resource
    private EbookNameMapper ebookMapper;

    public List<EbookNameResp> list(EbookNameReq req) {
        EbookNameExample ebookExample = new EbookNameExample();
        EbookNameExample.Criteria criteria = ebookExample.createCriteria();
        criteria.andNameLike("%" + req.getName() + "%");
        List<EbookName> ebookList = ebookMapper.selectByExample(ebookExample);

        List<EbookNameResp> respList = new ArrayList<>();
        for (EbookName ebook : ebookList) {
            EbookNameResp ebookNameResp = new EbookNameResp();
            BeanUtils.copyProperties(ebook, ebookNameResp);
            respList.add(ebookNameResp);
        }

        return respList;
    }
}
