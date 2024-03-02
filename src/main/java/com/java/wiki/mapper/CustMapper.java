package com.java.wiki.mapper;

import com.java.wiki.domain.CstCustomer;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CustMapper {

    List<CstCustomer> list();
}
