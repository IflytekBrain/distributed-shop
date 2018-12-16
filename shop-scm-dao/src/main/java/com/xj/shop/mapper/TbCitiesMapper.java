package com.xj.shop.mapper;

import com.xj.shop.domain.TbCities;
import com.xj.shop.domain.TbCitiesExample;

import java.util.List;

public interface TbCitiesMapper {
    int countByExample(TbCitiesExample example);

    int deleteByExample(TbCitiesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbCities record);

    int insertSelective(TbCities record);

    List<TbCities> selectByExample(TbCitiesExample example);

    TbCities selectByPrimaryKey(Integer id);

//    int updateByExampleSelective(@Param( "record" ) TbCities record, @Param( "example" ) TbCitiesExample example);
//
//    int updateByExample(@Param( "record" ) TbCities record, @Param( "example" ) TbCitiesExample example);

    int updateByPrimaryKeySelective(TbCities record);

    int updateByPrimaryKey(TbCities record);
}