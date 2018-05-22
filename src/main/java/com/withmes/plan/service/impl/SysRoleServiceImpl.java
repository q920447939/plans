package com.withmes.plan.service.impl;

import com.withmes.plan.config.base.service.BaseService;
import com.withmes.plan.entity.SysRole;
import com.withmes.plan.mapper.SysRoleMapper;
import com.withmes.plan.config.base.service.BaseServiceImpl;
import  com.withmes.plan.config.base.dal.BaseMapper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Description: 角色表 服务实现类
 * @author liming
 * @date 2018-05-22
 */
@Service
public class SysRoleServiceImpl extends BaseServiceImpl<SysRole> implements BaseService<SysRole> {

	@Autowired
	private SysRoleMapper mapper;

	@Override
	public BaseMapper<SysRole> getBaseMapper() {
		return mapper;
	}
	
}
