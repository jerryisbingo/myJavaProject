package com.cb.controller;

import com.cb.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description：
 * @Date 2017-12-6 09:19
 * @Author 陈斌
 */
@Controller
public class IndexController {

    @RequestMapping("/welcome")
    public String welcome(){
        return "welcome";
    }

    /*Springmvc默认会根据request中请求头是json还是xml来自动决定返回的是json还是xml，
    如果请求头中没有指定，那么ResponseBody默认返回的是xml格式，如果显示指定了返回类型produces为json，
    那么就直接返回json*/
    @RequestMapping(value = "/getJson",produces = "application/json;charset=UTF-8")
    @ResponseBody
    public User getJson(){
        User u=new User(1L,"cb","陈斌",18);
        return u;
    }



}
