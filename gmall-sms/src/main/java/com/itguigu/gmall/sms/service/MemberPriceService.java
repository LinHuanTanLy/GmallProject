package com.itguigu.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itguigu.gmall.sms.entity.MemberPriceEntity;
import com.itguigu.core.bean.PageVo;
import com.itguigu.core.bean.QueryCondition;


/**
 * 商品会员价格
 *
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-03-26 17:14:22
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageVo queryPage(QueryCondition params);
}

