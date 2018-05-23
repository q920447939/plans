/**
 * @Project: 跳转登陆页面
 * @Author: liming
 * @Date: 2018年05月22日
 * @Copyright: 2018-2028 www.haokukeji.com Inc. All rights reserved.
 */
package com.withmes.plan.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ClassName: LoginController
 * @Description: 跳转登陆页面
 * @author liming
 * @date 2018年05月22日
 */
@Controller
public class LoginController  {

    @RequestMapping(value = "/login")
    public  String reachLogin(){
        System.out.println(22222444);
        return "login";
    }

    @PostMapping(value = "/register")
    @ResponseBody
    public  String toTestHtml( Object obj){
        System.out.println(obj+"--------");
        return "register";
    }
}
