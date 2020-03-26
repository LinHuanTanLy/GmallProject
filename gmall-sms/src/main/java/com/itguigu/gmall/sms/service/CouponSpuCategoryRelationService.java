package com.itguigu.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itguigu.gmall.sms.entity.CouponSpuCategoryRelationEntity;
import com.itguigu.core.bean.PageVo;
import com.itguigu.core.bean.QueryCondition;


/**
 * 优惠券分类关联
 *
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-03-26 17:14:22
 */
public interface CouponSpuCategoryRelationService extends IService<CouponSpuCategoryRelationEntity> {

    PageVo queryPage(QueryCondition params);
}

