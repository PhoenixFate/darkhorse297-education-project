package com.phoenixfate.education.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user")
public class UserController {


    @RequestMapping("login")
    @ResponseBody
    public String login(){
        System.out.println("hello login");
        return "hello";
    }

}
