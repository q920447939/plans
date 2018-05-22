package com.withmes.plan.service.impl;

import com.withmes.plan.config.base.service.BaseService;
import com.withmes.plan.entity.SysUser;
import com.withmes.plan.mapper.SysUserMapper;
import com.withmes.plan.config.base.service.BaseServiceImpl;
import  com.withmes.plan.config.base.dal.BaseMapper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Description: 用户表 服务实现类
 * @author liming
 * @date 2018-05-22
 */
@Service
public class SysUserServiceImpl extends BaseServiceImpl<SysUser> implements BaseService<SysUser> {

	@Autowired
	private SysUserMapper mapper;

	@Override
	public BaseMapper<SysUser> getBaseMapper() {
		return mapper;
	}
	
}
