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

    @RequestMapping(value = "/getJson",produces = "application/json;charset=UTF-8")
    @ResponseBody
    public User getJson(){
        User u=new User(1L,"cb","陈斌",18);
        return u;
    }



}
