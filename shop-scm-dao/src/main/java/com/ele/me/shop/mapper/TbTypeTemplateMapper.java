package com.ele.me.shop.mapper;


import com.ele.me.shop.pojo.domain.TbTypeTemplate;
import com.ele.me.shop.pojo.domain.TbTypeTemplateExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbTypeTemplateMapper {
    int countByExample(TbTypeTemplateExample example);

    int deleteByExample(TbTypeTemplateExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbTypeTemplate record);

    int insertSelective(TbTypeTemplate record);

    List<TbTypeTemplate> selectByExample(TbTypeTemplateExample example);

    TbTypeTemplate selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param( "record" ) TbTypeTemplate record, @Param( "example" ) TbTypeTemplateExample example);

    int updateByExample(@Param( "record" ) TbTypeTemplate record, @Param( "example" ) TbTypeTemplateExample example);

    int updateByPrimaryKeySelective(TbTypeTemplate record);

    int updateByPrimaryKey(TbTypeTemplate record);
}