package com.withmes.plan.service.impl;

import com.withmes.plan.config.base.service.BaseService;
import com.withmes.plan.entity.SysUserRoleRelation;
import com.withmes.plan.mapper.SysUserRoleRelationMapper;
import com.withmes.plan.config.base.service.BaseServiceImpl;
import  com.withmes.plan.config.base.dal.BaseMapper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Description: 用户角色关联表 服务实现类
 * @author liming
 * @date 2018-05-22
 */
@Service
public class SysUserRoleRelationServiceImpl extends BaseServiceImpl<SysUserRoleRelation> implements BaseService<SysUserRoleRelation> {

	@Autowired
	private SysUserRoleRelationMapper mapper;

	@Override
	public BaseMapper<SysUserRoleRelation> getBaseMapper() {
		return mapper;
	}
	
}
