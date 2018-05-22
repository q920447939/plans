package com.withmes.plan.service.impl;

import com.withmes.plan.config.base.service.BaseService;
import com.withmes.plan.entity.SysMean;
import com.withmes.plan.mapper.SysMeanMapper;
import com.withmes.plan.config.base.service.BaseServiceImpl;
import  com.withmes.plan.config.base.dal.BaseMapper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Description: 菜单表 服务实现类
 * @author liming
 * @date 2018-05-22
 */
@Service
public class SysMeanServiceImpl extends BaseServiceImpl<SysMean> implements BaseService<SysMean> {

	@Autowired
	private SysMeanMapper mapper;

	@Override
	public BaseMapper<SysMean> getBaseMapper() {
		return mapper;
	}
	
}
