package com.atguigu.gmall.sms.dao;

import com.atguigu.gmall.sms.entity.SkuLadderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品阶梯价格
 * 
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-03-26 17:14:22
 */
@Mapper
public interface SkuLadderDao extends BaseMapper<SkuLadderEntity> {
	
}
