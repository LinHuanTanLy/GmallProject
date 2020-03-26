package com.itguigu.gmall.sms.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itguigu.core.bean.PageVo;
import com.itguigu.core.bean.Query;
import com.itguigu.core.bean.QueryCondition;

import com.itguigu.gmall.sms.dao.HomeSubjectDao;
import com.itguigu.gmall.sms.entity.HomeSubjectEntity;
import com.itguigu.gmall.sms.service.HomeSubjectService;


@Service("homeSubjectService")
public class HomeSubjectServiceImpl extends ServiceImpl<HomeSubjectDao, HomeSubjectEntity> implements HomeSubjectService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<HomeSubjectEntity> page = this.page(
                new Query<HomeSubjectEntity>().getPage(params),
                new QueryWrapper<HomeSubjectEntity>()
        );

        return new PageVo(page);
    }

}