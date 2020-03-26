package com.itguigu.gmall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itguigu.gmall.oms.entity.OrderOperateHistoryEntity;
import com.itguigu.core.bean.PageVo;
import com.itguigu.core.bean.QueryCondition;


/**
 * 订单操作历史记录
 *
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-03-26 17:32:25
 */
public interface OrderOperateHistoryService extends IService<OrderOperateHistoryEntity> {

    PageVo queryPage(QueryCondition params);
}

