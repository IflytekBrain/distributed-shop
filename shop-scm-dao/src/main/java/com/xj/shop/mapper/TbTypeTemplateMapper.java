package com.xj.shop.mapper;


import com.xj.shop.domain.TbTypeTemplate;
import com.xj.shop.domain.TbTypeTemplateExample;

import java.util.List;

public interface TbTypeTemplateMapper {
    int countByExample(TbTypeTemplateExample example);

    int deleteByExample(TbTypeTemplateExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbTypeTemplate record);

    int insertSelective(TbTypeTemplate record);

    List<TbTypeTemplate> selectByExample(TbTypeTemplateExample example);

    TbTypeTemplate selectByPrimaryKey(Long id);

//    int updateByExampleSelective(@Param( "record" ) TbTypeTemplate record, @Param( "example" ) TbTypeTemplateExample example);
//
//    int updateByExample(@Param( "record" ) TbTypeTemplate record, @Param( "example" ) TbTypeTemplateExample example);

    int updateByPrimaryKeySelective(TbTypeTemplate record);

    int updateByPrimaryKey(TbTypeTemplate record);
}