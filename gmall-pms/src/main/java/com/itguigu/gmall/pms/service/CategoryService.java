package com.itguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itguigu.gmall.pms.entity.CategoryEntity;
import com.itguigu.core.bean.PageVo;
import com.itguigu.core.bean.QueryCondition;


/**
 * 商品三级分类
 *
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-03-26 16:59:00
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageVo queryPage(QueryCondition params);
}

