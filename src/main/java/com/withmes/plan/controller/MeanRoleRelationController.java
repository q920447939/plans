package com.withmes.plan.controller;


import com.withmes.plan.config.base.web.BaseRestfulController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: 菜单角色关联表
 前端控制器
 * @author liming
 * @date 2018-05-18
 */
@RestController
@RequestMapping("meanRoleRelation")
public class MeanRoleRelationController extends BaseRestfulController {
   @GetMapping("/hello")
   public  String test () {
    return  "Hello plans!";
   }
}

