package com.withmes.plan.controller;


import com.withmes.plan.config.base.web.BaseRestfulController;
import com.withmes.plan.entity.MeanRoleRelation;
import com.withmes.plan.service.MeanRoleRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * @author liming
 * @Description: 菜单角色关联表
 * 前端控制器
 * @date 2018-05-18
 */
@RestController
@RequestMapping("meanRoleRelation")
public class MeanRoleRelationController extends BaseRestfulController {
    @Autowired
    private MeanRoleRelationService meanRoleRelationService;

    @GetMapping("/hello")
    public MeanRoleRelation test() {
        MeanRoleRelation allMeanRoleRelation = meanRoleRelationService.findAllMeanRoleRelation();
        return allMeanRoleRelation;
    }
}

