package com.itguigu.gmall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itguigu.gmall.oms.entity.OrderReturnApplyEntity;
import com.itguigu.core.bean.PageVo;
import com.itguigu.core.bean.QueryCondition;


/**
 * 订单退货申请
 *
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-03-26 17:32:25
 */
public interface OrderReturnApplyService extends IService<OrderReturnApplyEntity> {

    PageVo queryPage(QueryCondition params);
}

