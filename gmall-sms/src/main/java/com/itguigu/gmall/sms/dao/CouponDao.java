package com.itguigu.gmall.sms.dao;

import com.itguigu.gmall.sms.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-03-26 17:14:22
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
