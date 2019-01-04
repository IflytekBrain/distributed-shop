package com.xj.shop.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xj.shop.api.BrandService;
import com.xj.shop.pojo.domain.TbBrand;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BranchController {
    @Reference
    private BrandService brandService;

    @RequestMapping( "/brand/findAll.do" )
    public List<TbBrand> list() {
        List<TbBrand> all = brandService.findAll();
        return all;
    }
}