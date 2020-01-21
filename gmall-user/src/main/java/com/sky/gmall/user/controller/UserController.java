package com.sky.gmall.user.controller;

import com.sky.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    UserService userService;
    @ResponseBody
    @RequestMapping("index")
    public String hello(){
        return "Hello world";
    }
}
