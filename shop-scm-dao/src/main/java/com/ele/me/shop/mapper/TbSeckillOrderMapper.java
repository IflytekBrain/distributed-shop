package com.ele.me.shop.mapper;


import com.ele.me.shop.pojo.domain.TbSeckillOrder;
import com.ele.me.shop.pojo.domain.TbSeckillOrderExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbSeckillOrderMapper {
    int countByExample(TbSeckillOrderExample example);

    int deleteByExample(TbSeckillOrderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbSeckillOrder record);

    int insertSelective(TbSeckillOrder record);

    List<TbSeckillOrder> selectByExample(TbSeckillOrderExample example);

    TbSeckillOrder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param( "record" ) TbSeckillOrder record, @Param( "example" ) TbSeckillOrderExample example);

    int updateByExample(@Param( "record" ) TbSeckillOrder record, @Param( "example" ) TbSeckillOrderExample example);

    int updateByPrimaryKeySelective(TbSeckillOrder record);

    int updateByPrimaryKey(TbSeckillOrder record);
}