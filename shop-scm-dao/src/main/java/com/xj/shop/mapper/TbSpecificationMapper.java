package com.xj.shop.mapper;


import com.xj.shop.domain.TbSpecification;
import com.xj.shop.domain.TbSpecificationExample;

import java.util.List;
import java.util.Map;

public interface TbSpecificationMapper {
    int countByExample(TbSpecificationExample example);

    int deleteByExample(TbSpecificationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbSpecification record);

    int insertSelective(TbSpecification record);

    List<TbSpecification> selectByExample(TbSpecificationExample example);

    TbSpecification selectByPrimaryKey(Long id);

//    int updateByExampleSelective(@Param( "record" ) TbSpecification record, @Param( "example" ) TbSpecificationExample example);
//
//    int updateByExample(@Param( "record" ) TbSpecification record, @Param( "example" ) TbSpecificationExample example);

    int updateByPrimaryKeySelective(TbSpecification record);

    int updateByPrimaryKey(TbSpecification record);
    
    List<Map> selectOptionList();
}