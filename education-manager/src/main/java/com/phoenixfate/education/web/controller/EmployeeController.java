package com.phoenixfate.education.web.controller;

import com.phoenixfate.education.model.Employee;
import com.phoenixfate.education.web.controller.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("employee")
public class EmployeeController extends BaseController<Employee> {

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
