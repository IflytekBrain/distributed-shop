package com.xj.shop.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.xj.shop.api.SpecificationService;
import com.xj.shop.mapper.TbSpecificationMapper;
import com.xj.shop.mapper.TbSpecificationOptionMapper;
import com.xj.shop.pojo.domain.TbSpecification;
import com.xj.shop.pojo.domain.TbSpecificationExample;
import com.xj.shop.pojo.domain.TbSpecificationOption;
import com.xj.shop.pojo.domain.TbSpecificationOptionExample;
import com.xj.shop.pojo.dto.Specification;
import com.xj.shop.pojo.vo.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * 服务实现层
 *
 * @author Administrator
 */
@Service
@Transactional
public class SpecificationServiceImpl implements SpecificationService {

    @Autowired
    private TbSpecificationMapper specificationMapper;
    @Autowired
    private TbSpecificationOptionMapper specificationOptionMapper;

    /**
     * 查询全部
     */
    @Override
    public List<TbSpecification> findAll() {
        return specificationMapper.selectByExample(null);
    }

    /**
     * 按分页查询
     */
    @Override
    public PageResult findPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Page<TbSpecification> page = (Page<TbSpecification>) specificationMapper.selectByExample(null);
        return new PageResult(page.getTotal(), page.getResult());
    }

    /**
     * 增加
     */
    @Override
    public void add(Specification specification) {
        // 保存规格
        specificationMapper.insert(specification.getSpecification());
        // 保存规格选项
        for (TbSpecificationOption specificationOption : specification.getSpecificationOptionList()) {
            // 设置规格的ID:
            specificationOption.setSpecId(specification.getSpecification().getId());

            specificationOptionMapper.insert(specificationOption);
        }
    }


    /**
     * 修改
     */
    @Override
    public void update(Specification specification) {
        // 修改规格
        specificationMapper.updateByPrimaryKey(specification.getSpecification());

        // 先删除规格选项，再添加规格选项
        TbSpecificationOptionExample example = new TbSpecificationOptionExample();
        TbSpecificationOptionExample.Criteria criteria = example.createCriteria();
        criteria.andSpecIdEqualTo(specification.getSpecification().getId());
        specificationOptionMapper.deleteByExample(example);

        // 保存规格选项
        for (TbSpecificationOption specificationOption : specification.getSpecificationOptionList()) {
            // 设置规格的ID:
            specificationOption.setSpecId(specification.getSpecification().getId());

            specificationOptionMapper.insert(specificationOption);
        }
    }

    /**
     * 根据ID获取实体
     *
     * @param id
     * @return
     */
    @Override
    public Specification findOne(Long id) {
        Specification specification = new Specification();
        // 根据规格ID查询规格对象
        TbSpecification tbSpecification = specificationMapper.selectByPrimaryKey(id);
        specification.setSpecification(tbSpecification);

        // 根据规格的ID查询规格选项
        TbSpecificationOptionExample example = new TbSpecificationOptionExample();
        TbSpecificationOptionExample.Criteria criteria = example.createCriteria();
        criteria.andSpecIdEqualTo(id);
        List<TbSpecificationOption> list = specificationOptionMapper.selectByExample(example);
        specification.setSpecificationOptionList(list);

        return specification;
    }

    /**
     * 批量删除
     */
    @Override
    public void delete(Long[] ids) {
        for (Long id : ids) {
            // 删除规格
            specificationMapper.deleteByPrimaryKey(id);

            // 删除规格选项:
            TbSpecificationOptionExample example = new TbSpecificationOptionExample();
            TbSpecificationOptionExample.Criteria criteria = example.createCriteria();
            criteria.andSpecIdEqualTo(id);
            specificationOptionMapper.deleteByExample(example);
        }
    }


    @Override
    public PageResult findPage(TbSpecification specification, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);

        TbSpecificationExample example = new TbSpecificationExample();
        TbSpecificationExample.Criteria criteria = example.createCriteria();

        if (specification != null) {
            if (specification.getSpecName() != null && specification.getSpecName().length() > 0) {
                criteria.andSpecNameLike("%" + specification.getSpecName() + "%");
            }

        }

        Page<TbSpecification> page = (Page<TbSpecification>) specificationMapper.selectByExample(example);
        return new PageResult(page.getTotal(), page.getResult());
    }

    @Override
    public List<Map> selectOptionList() {
        return specificationMapper.selectOptionList();
    }

}
