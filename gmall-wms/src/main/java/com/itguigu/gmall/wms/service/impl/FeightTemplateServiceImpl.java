package com.itguigu.gmall.wms.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itguigu.core.bean.PageVo;
import com.itguigu.core.bean.Query;
import com.itguigu.core.bean.QueryCondition;

import com.itguigu.gmall.wms.dao.FeightTemplateDao;
import com.itguigu.gmall.wms.entity.FeightTemplateEntity;
import com.itguigu.gmall.wms.service.FeightTemplateService;


@Service("feightTemplateService")
public class FeightTemplateServiceImpl extends ServiceImpl<FeightTemplateDao, FeightTemplateEntity> implements FeightTemplateService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<FeightTemplateEntity> page = this.page(
                new Query<FeightTemplateEntity>().getPage(params),
                new QueryWrapper<FeightTemplateEntity>()
        );

        return new PageVo(page);
    }

}