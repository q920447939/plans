package com.withmes.plan.controller;


import com.withmes.plan.entity.SysUser;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import com.withmes.plan.config.base.web.BaseRestfulController;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description: 用户表 前端控制器
 * @author liming
 * @date 2018-05-23
 */
@Controller
@RequestMapping("sysUser")
public class SysUserController extends BaseRestfulController {

    @PostMapping("/register")
    @ResponseBody
    public void addSysUser( SysUser sysUser){
        System.out.println(sysUser.toString());
    }
}

