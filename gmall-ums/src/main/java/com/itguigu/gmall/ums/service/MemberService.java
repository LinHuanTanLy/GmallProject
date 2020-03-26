package com.itguigu.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itguigu.gmall.ums.entity.MemberEntity;
import com.itguigu.core.bean.PageVo;
import com.itguigu.core.bean.QueryCondition;


/**
 * 会员
 *
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-03-26 17:28:14
 */
public interface MemberService extends IService<MemberEntity> {

    PageVo queryPage(QueryCondition params);
}

