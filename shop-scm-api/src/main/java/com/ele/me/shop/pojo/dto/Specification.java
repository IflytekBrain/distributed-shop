package com.ele.me.shop.pojo.dto;


import com.ele.me.shop.pojo.domain.TbSpecification;
import com.ele.me.shop.pojo.domain.TbSpecificationOption;

import java.io.Serializable;
import java.util.List;

/**
 * 组合实体类
 */

public class Specification implements Serializable {
    /**
     * 规格实体
     */
    private TbSpecification specification;
    /**
     * 规格选项集合
     */
    private List<TbSpecificationOption> specificationOptionList;

    public TbSpecification getSpecification() {
        return specification;
    }

    public void setSpecification(TbSpecification specification) {
        this.specification = specification;
    }

    public List<TbSpecificationOption> getSpecificationOptionList() {
        return specificationOptionList;
    }

    public void setSpecificationOptionList(List<TbSpecificationOption> specificationOptionList) {
        this.specificationOptionList = specificationOptionList;
    }
}
