package com.withmes.plan.service.impl;

import com.withmes.plan.config.base.dal.BaseMapper;
import com.withmes.plan.config.base.service.BaseServiceImpl;
import com.withmes.plan.entity.MeanRoleRelation;
import com.withmes.plan.service.MeanRoleRelationService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Description: 菜单角色关联表
 服务实现类
 * @author liming
 * @date 2018-05-18
 */
@Service
public class MeanRoleRelationServiceImpl  extends BaseServiceImpl<MeanRoleRelation> implements MeanRoleRelationService {

	@Autowired
	private MeanRoleRelationMapper mapper;

	@Override
	public BaseMapper<MeanRoleRelation> getBaseMapper() {
		return mapper;
	}

	@Override
	public MeanRoleRelation findAllMeanRoleRelation() {
		List<MeanRoleRelation> meanRoleRelationAll = mapper.findMeanRoleRelationAll();
		return meanRoleRelationAll.get(0);
	}

}
