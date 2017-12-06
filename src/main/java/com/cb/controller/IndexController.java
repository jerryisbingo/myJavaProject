package com.cb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description：
 * @Date 2017-12-6 09:19
 * @Author 陈斌
 */
@Controller
@RequestMapping("/index")
public class IndexController {

    @RequestMapping("/welcome")
    public String welcome(){
        return "welcome";
    }

}
