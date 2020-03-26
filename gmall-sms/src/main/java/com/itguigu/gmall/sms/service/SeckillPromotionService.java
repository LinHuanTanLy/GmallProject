package com.itguigu.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itguigu.gmall.sms.entity.SeckillPromotionEntity;
import com.itguigu.core.bean.PageVo;
import com.itguigu.core.bean.QueryCondition;


/**
 * 秒杀活动
 *
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-03-26 17:14:22
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageVo queryPage(QueryCondition params);
}

