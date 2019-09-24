package com.phoenixfate.education.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("department")
public class DepartmentController {


    @RequestMapping("manage")
    public String manage(){
        return "department/manage";
    }

    @RequestMapping("info")
    public String info(){
        return "department/info";
    }


    @RequestMapping("edit")
    public String edit(){
        return "department/edit";
    }

}
