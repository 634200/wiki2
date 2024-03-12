package com.java.wiki.service;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.java.wiki.mapper.EbookNameMapper;
import com.java.wiki.pojo.EbookName;
import com.java.wiki.pojo.EbookNameExample;
import com.java.wiki.req.EbookNameReq;
import com.java.wiki.resp.EbookNameResp;
import com.java.wiki.util.CopyUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service

public class EbookService {

    private static final Logger LOG = LoggerFactory.getLogger(EbookService.class);
    @Resource
    private EbookNameMapper ebookMapper;

    public List<EbookNameResp> list(EbookNameReq req) {


        EbookNameExample ebookExample = new EbookNameExample();
        EbookNameExample.Criteria criteria = ebookExample.createCriteria();
        if (!ObjectUtils.isEmpty(req.getName())) {
            criteria.andNameLike("%" + req.getName() + "%");
        }
        PageHelper.startPage(1, 3);
        List<EbookName> ebookList = ebookMapper.selectByExample(ebookExample);

        PageInfo<EbookName> pageInfo = new PageInfo<>(ebookList);
        LOG.info("总行数：{}", pageInfo.getTotal());
        LOG.info("总页数：{}", pageInfo.getPages());

//        List<EbookNameResp> respList = new ArrayList<>();
//        for (EbookName ebook : ebookList) {
////            EbookNameResp ebookNameResp = new EbookNameResp();
////            BeanUtils.copyProperties(ebook, ebookNameResp);
////          对象复制
//            EbookNameResp ebookNameResp = CopyUtil.copy(ebook, EbookNameResp.class);
//            respList.add(ebookNameResp);
//        }
        //列表复制
        List<EbookNameResp> list = CopyUtil.copyList(ebookList, EbookNameResp.class);
        return list;
    }
}
