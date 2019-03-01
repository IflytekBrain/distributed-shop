package com.ele.me.shop.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ele.me.shop.api.BrandService;
import com.ele.me.shop.pojo.domain.TbBrand;
import com.ele.me.shop.pojo.vo.PageResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "/brand" )
public class BranchController {
    @Reference
    private BrandService brandService;

    /**
     * 条件搜索(分页)
     *
     * @param brand
     * @param page
     * @param rows
     * @return
     */
    @RequestMapping( "/search.do" )
    public PageResult search(TbBrand brand, int page, int rows) {
        return brandService.findByPage(brand, page, rows);
    }
}