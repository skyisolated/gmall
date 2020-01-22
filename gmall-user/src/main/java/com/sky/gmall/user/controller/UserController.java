package com.sky.gmall.user.controller;

import com.sky.gmall.user.bean.UmsMember;
import com.sky.gmall.user.bean.UmsMemberLevel;
import com.sky.gmall.user.bean.UmsMemberReceiveAddress;
import com.sky.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    //UmsMember
    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){
        List<UmsMember> members = userService.getAllUser();
        return members;
    }
    @RequestMapping("updateUserById")
    @ResponseBody
    public UmsMember updateUserById(String id){
        UmsMember user = userService.updateUserById(id);
        return user;
    }

    @RequestMapping("getUserById")
    @ResponseBody
    public UmsMember getUserById(String id){
        UmsMember user = userService.getUserById(id);
        return user;
    }

    //Address
    @RequestMapping("getAllAddress")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getAllAddress(){
        List<UmsMemberReceiveAddress> addresses = userService.getAllAddress();
        return addresses;
    }

    @RequestMapping("getAddressByMemberId")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getAddressByMemberId(String memberId){
        List<UmsMemberReceiveAddress> addresses = userService.getAddressByMemberId(memberId);
        return addresses;
    }

    //level
    @RequestMapping("getAllLevel")
    @ResponseBody
    public List<UmsMemberLevel> getAllLevel(){
        List<UmsMemberLevel> levels = userService.getAllLevel();
        return levels;
    }
    @ResponseBody
    @RequestMapping("index")
    public String hello(){
        return "Hello world";
    }





}
