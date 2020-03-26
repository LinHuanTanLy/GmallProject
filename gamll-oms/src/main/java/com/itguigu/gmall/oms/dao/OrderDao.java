package com.itguigu.gmall.oms.dao;

import com.itguigu.gmall.oms.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-03-26 17:32:25
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
