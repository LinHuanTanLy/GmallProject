package com.itguigu.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itguigu.gmall.sms.entity.CouponEntity;
import com.itguigu.core.bean.PageVo;
import com.itguigu.core.bean.QueryCondition;


/**
 * 优惠券信息
 *
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-03-26 17:14:22
 */
public interface CouponService extends IService<CouponEntity> {

    PageVo queryPage(QueryCondition params);
}

