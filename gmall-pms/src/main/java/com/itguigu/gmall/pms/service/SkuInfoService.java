package com.itguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itguigu.gmall.pms.entity.SkuInfoEntity;
import com.itguigu.core.bean.PageVo;
import com.itguigu.core.bean.QueryCondition;


/**
 * sku信息
 *
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-03-26 16:58:59
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageVo queryPage(QueryCondition params);
}

