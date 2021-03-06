package com.phoenixfate.education.web.controller;

import com.phoenixfate.education.model.Department;
import com.phoenixfate.education.web.controller.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("department")
public class DepartmentController extends BaseController<Department> {


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
