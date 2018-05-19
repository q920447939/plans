/**
 * @Project: TestController
 * @Author: liming
 * @Date: 2018年05月19日
 * @Copyright: 2018-2028 www.haokukeji.com Inc. All rights reserved.
 */
package com.withmes.plan.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName: TestController
 * @Description: TestController
 * @author liming
 * @date 2018年05月19日
 */
@Controller
public class TestController {

    @RequestMapping("/index")
    public  String showIndex () {
        return "index";
    }
}
