package com.phoenixfate.education.web.controller;

import com.phoenixfate.education.model.Salary;
import com.phoenixfate.education.web.controller.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("salary")
public class SalaryController extends BaseController<Salary> {



    @RequestMapping(MANAGE)
    public String manage(){

        return MANAGE_PAGE;
    }

    @RequestMapping(INFO)
    public String info(){
        return INFO_PAGE;
    }


    @RequestMapping(EDIT)
    public String edit(){
        return EDIT_PAGE;
    }

}
