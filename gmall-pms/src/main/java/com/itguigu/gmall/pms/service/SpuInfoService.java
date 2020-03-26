package com.itguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itguigu.gmall.pms.entity.SpuInfoEntity;
import com.itguigu.core.bean.PageVo;
import com.itguigu.core.bean.QueryCondition;


/**
 * spu信息
 *
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-03-26 16:59:00
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageVo queryPage(QueryCondition params);
}

