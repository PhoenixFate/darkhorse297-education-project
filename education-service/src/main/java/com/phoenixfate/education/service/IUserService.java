package com.phoenixfate.education.service;

import com.phoenixfate.education.model.User;
import com.phoenixfate.education.service.base.IBaseService;

public interface IUserService  extends IBaseService<User> {

//    特有的方法
    User login(String username,String password);

}
