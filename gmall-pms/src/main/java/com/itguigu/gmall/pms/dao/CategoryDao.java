package com.itguigu.gmall.pms.dao;

import com.itguigu.gmall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-03-26 16:59:00
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
