package com.ele.me.shop.mapper;


import com.ele.me.shop.pojo.domain.TbProvinces;
import com.ele.me.shop.pojo.domain.TbProvincesExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbProvincesMapper {
    int countByExample(TbProvincesExample example);

    int deleteByExample(TbProvincesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbProvinces record);

    int insertSelective(TbProvinces record);

    List<TbProvinces> selectByExample(TbProvincesExample example);

    TbProvinces selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param( "record" ) TbProvinces record, @Param( "example" ) TbProvincesExample example);

    int updateByExample(@Param( "record" ) TbProvinces record, @Param( "example" ) TbProvincesExample example);

    int updateByPrimaryKeySelective(TbProvinces record);

    int updateByPrimaryKey(TbProvinces record);
}