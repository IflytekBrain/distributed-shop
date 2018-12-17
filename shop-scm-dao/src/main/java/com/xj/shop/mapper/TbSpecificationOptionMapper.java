package com.xj.shop.mapper;


import com.xj.shop.pojo.domain.TbSpecificationOption;
import com.xj.shop.pojo.domain.TbSpecificationOptionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbSpecificationOptionMapper {
    int countByExample(TbSpecificationOptionExample example);

    int deleteByExample(TbSpecificationOptionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbSpecificationOption record);

    int insertSelective(TbSpecificationOption record);

    List<TbSpecificationOption> selectByExample(TbSpecificationOptionExample example);

    TbSpecificationOption selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param( "record" ) TbSpecificationOption record, @Param( "example" ) TbSpecificationOptionExample example);

    int updateByExample(@Param( "record" ) TbSpecificationOption record, @Param( "example" ) TbSpecificationOptionExample example);

    int updateByPrimaryKeySelective(TbSpecificationOption record);

    int updateByPrimaryKey(TbSpecificationOption record);
}