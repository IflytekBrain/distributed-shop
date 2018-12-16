package com.xj.shop.mapper;


import com.xj.shop.domain.TbUser;
import com.xj.shop.domain.TbUserExample;

import java.util.List;

public interface TbUserMapper {
    int countByExample(TbUserExample example);

    int deleteByExample(TbUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbUser record);

    int insertSelective(TbUser record);

    List<TbUser> selectByExample(TbUserExample example);

    TbUser selectByPrimaryKey(Long id);

//    int updateByExampleSelective(@Param( "record" ) TbUser record, @Param( "example" ) TbUserExample example);
//
//    int updateByExample(@Param( "record" ) TbUser record, @Param( "example" ) TbUserExample example);

    int updateByPrimaryKeySelective(TbUser record);

    int updateByPrimaryKey(TbUser record);
}