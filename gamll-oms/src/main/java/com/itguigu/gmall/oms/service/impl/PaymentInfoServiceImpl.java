package com.itguigu.gmall.oms.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itguigu.core.bean.PageVo;
import com.itguigu.core.bean.Query;
import com.itguigu.core.bean.QueryCondition;

import com.itguigu.gmall.oms.dao.PaymentInfoDao;
import com.itguigu.gmall.oms.entity.PaymentInfoEntity;
import com.itguigu.gmall.oms.service.PaymentInfoService;


@Service("paymentInfoService")
public class PaymentInfoServiceImpl extends ServiceImpl<PaymentInfoDao, PaymentInfoEntity> implements PaymentInfoService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<PaymentInfoEntity> page = this.page(
                new Query<PaymentInfoEntity>().getPage(params),
                new QueryWrapper<PaymentInfoEntity>()
        );

        return new PageVo(page);
    }

}