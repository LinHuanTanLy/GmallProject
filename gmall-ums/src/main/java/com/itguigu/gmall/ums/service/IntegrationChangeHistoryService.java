package com.itguigu.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itguigu.gmall.ums.entity.IntegrationChangeHistoryEntity;
import com.itguigu.core.bean.PageVo;
import com.itguigu.core.bean.QueryCondition;


/**
 * 积分变化历史记录
 *
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-03-26 17:28:14
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageVo queryPage(QueryCondition params);
}

