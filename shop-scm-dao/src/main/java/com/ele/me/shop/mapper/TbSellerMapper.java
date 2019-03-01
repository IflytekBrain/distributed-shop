package com.ele.me.shop.mapper;


import com.ele.me.shop.pojo.domain.TbSeller;
import com.ele.me.shop.pojo.domain.TbSellerExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbSellerMapper {
    int countByExample(TbSellerExample example);

    int deleteByExample(TbSellerExample example);

    int deleteByPrimaryKey(String sellerId);

    int insert(TbSeller record);

    int insertSelective(TbSeller record);

    List<TbSeller> selectByExample(TbSellerExample example);

    TbSeller selectByPrimaryKey(String sellerId);

    int updateByExampleSelective(@Param( "record" ) TbSeller record, @Param( "example" ) TbSellerExample example);

    int updateByExample(@Param( "record" ) TbSeller record, @Param( "example" ) TbSellerExample example);

    int updateByPrimaryKeySelective(TbSeller record);

    int updateByPrimaryKey(TbSeller record);
}