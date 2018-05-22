package com.withmes.plan.service.impl;

import com.withmes.plan.config.base.service.BaseService;
import com.withmes.plan.entity.SysMeanRoleRelation;
import com.withmes.plan.mapper.SysMeanRoleRelationMapper;
import com.withmes.plan.config.base.service.BaseServiceImpl;
import  com.withmes.plan.config.base.dal.BaseMapper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Description: 菜单角色关联表
 服务实现类
 * @author liming
 * @date 2018-05-22
 */
@Service
public class SysMeanRoleRelationServiceImpl extends BaseServiceImpl<SysMeanRoleRelation> implements BaseService<SysMeanRoleRelation> {

	@Autowired
	private SysMeanRoleRelationMapper mapper;

	@Override
	public BaseMapper<SysMeanRoleRelation> getBaseMapper() {
		return mapper;
	}
	
}
