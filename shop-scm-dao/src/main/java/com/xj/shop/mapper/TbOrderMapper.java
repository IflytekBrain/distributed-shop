package com.xj.shop.mapper;



import com.xj.shop.domain.TbOrder;
import com.xj.shop.domain.TbOrderExample;

import java.util.List;

public interface TbOrderMapper {
    int countByExample(TbOrderExample example);

    int deleteByExample(TbOrderExample example);

    int deleteByPrimaryKey(Long orderId);

    int insert(TbOrder record);

    int insertSelective(TbOrder record);

    List<TbOrder> selectByExample(TbOrderExample example);

    TbOrder selectByPrimaryKey(Long orderId);

//    int updateByExampleSelective(@Param( "record" ) TbOrder record, @Param( "example" ) TbOrderExample example);

//    int updateByExample(@Param( "record" ) TbOrder record, @Param( "example" ) TbOrderExample example);

    int updateByPrimaryKeySelective(TbOrder record);

    int updateByPrimaryKey(TbOrder record);
}