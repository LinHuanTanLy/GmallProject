package com.itguigu.gmall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itguigu.gmall.oms.entity.PaymentInfoEntity;
import com.itguigu.core.bean.PageVo;
import com.itguigu.core.bean.QueryCondition;


/**
 * 支付信息表
 *
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-03-26 17:32:25
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageVo queryPage(QueryCondition params);
}

