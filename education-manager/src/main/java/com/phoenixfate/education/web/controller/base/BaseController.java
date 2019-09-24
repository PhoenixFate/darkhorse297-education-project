package com.phoenixfate.education.web.controller.base;

import java.lang.reflect.Type;

public abstract class BaseController<T> {

    protected static String MANAGE_PAGE;

    protected static String INFO_PAGE;

    protected static String EDIT_PAGE;


    public BaseController(){
        //1.获得范型的真实类型
        Type type=this.getClass().getGenericSuperclass();
        String typeName = type.getClass().getName();
        System.out.println("--------------: "+typeName);
        MANAGE_PAGE=typeName.toLowerCase()+"/manage";
        INFO_PAGE=typeName.toLowerCase()+"/info";
        EDIT_PAGE=typeName.toLowerCase()+"/edit";
    }

}
