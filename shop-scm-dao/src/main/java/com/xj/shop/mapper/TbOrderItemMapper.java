package com.xj.shop.mapper;



import com.xj.shop.domain.TbOrderItem;
import com.xj.shop.domain.TbOrderItemExample;

import java.util.List;

public interface TbOrderItemMapper {
    int countByExample(TbOrderItemExample example);

    int deleteByExample(TbOrderItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbOrderItem record);

    int insertSelective(TbOrderItem record);

    List<TbOrderItem> selectByExample(TbOrderItemExample example);

    TbOrderItem selectByPrimaryKey(Long id);

//    int updateByExampleSelective(@Param( "record" ) TbOrderItem record, @Param( "example" ) TbOrderItemExample example);
//
//    int updateByExample(@Param( "record" ) TbOrderItem record, @Param( "example" ) TbOrderItemExample example);

    int updateByPrimaryKeySelective(TbOrderItem record);

    int updateByPrimaryKey(TbOrderItem record);
}