package com.itguigu.gmall.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itguigu.gmall.wms.entity.FeightTemplateEntity;
import com.itguigu.core.bean.PageVo;
import com.itguigu.core.bean.QueryCondition;


/**
 * 运费模板
 *
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-03-26 17:35:38
 */
public interface FeightTemplateService extends IService<FeightTemplateEntity> {

    PageVo queryPage(QueryCondition params);
}

