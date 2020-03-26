package com.itguigu.gmall.sms.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itguigu.core.bean.PageVo;
import com.itguigu.core.bean.Query;
import com.itguigu.core.bean.QueryCondition;

import com.itguigu.gmall.sms.dao.CouponHistoryDao;
import com.itguigu.gmall.sms.entity.CouponHistoryEntity;
import com.itguigu.gmall.sms.service.CouponHistoryService;


@Service("couponHistoryService")
public class CouponHistoryServiceImpl extends ServiceImpl<CouponHistoryDao, CouponHistoryEntity> implements CouponHistoryService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<CouponHistoryEntity> page = this.page(
                new Query<CouponHistoryEntity>().getPage(params),
                new QueryWrapper<CouponHistoryEntity>()
        );

        return new PageVo(page);
    }

}