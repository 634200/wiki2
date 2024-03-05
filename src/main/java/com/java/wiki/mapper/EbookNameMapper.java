package com.java.wiki.mapper;

import com.java.wiki.pojo.EbookName;
import com.java.wiki.pojo.EbookNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EbookNameMapper {
    long countByExample(EbookNameExample example);

    int deleteByExample(EbookNameExample example);

    int deleteByPrimaryKey(Long id);

    int insert(EbookName record);

    int insertSelective(EbookName record);

    List<EbookName> selectByExample(EbookNameExample example);

    EbookName selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EbookName record, @Param("example") EbookNameExample example);

    int updateByExample(@Param("record") EbookName record, @Param("example") EbookNameExample example);

    int updateByPrimaryKeySelective(EbookName record);

    int updateByPrimaryKey(EbookName record);
}