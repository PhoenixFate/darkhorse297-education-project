package com.phoenixfate.education.web.controller;

import com.phoenixfate.education.model.User;
import com.phoenixfate.education.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private IUserService userService;


    @RequestMapping("login")
    @ResponseBody
    public String login(){
        System.out.println("hello login");
        return "hello";
    }

    @RequestMapping("find")
    @ResponseBody
    public String login(Integer id){
        User user = userService.findById(id);
        System.out.println(user);
        return user.toString();
    }

}
