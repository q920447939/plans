package com.withmes.plan.service.impl;

import com.withmes.plan.config.base.service.BaseService;
import com.withmes.plan.entity.SysUserAnnexation;
import com.withmes.plan.mapper.SysUserAnnexationMapper;
import com.withmes.plan.config.base.service.BaseServiceImpl;
import  com.withmes.plan.config.base.dal.BaseMapper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Description: 用户附加信息表 服务实现类
 * @author liming
 * @date 2018-05-22
 */
@Service
public class SysUserAnnexationServiceImpl extends BaseServiceImpl<SysUserAnnexation> implements BaseService<SysUserAnnexation> {

	@Autowired
	private SysUserAnnexationMapper mapper;

	@Override
	public BaseMapper<SysUserAnnexation> getBaseMapper() {
		return mapper;
	}
	
}
