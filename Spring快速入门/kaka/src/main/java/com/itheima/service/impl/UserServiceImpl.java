package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.service.UserService;

public class UserServiceImpl implements UserService {
  private UserDao userDao;

  public UserServiceImpl(UserDao userDao) {
    this.userDao = userDao;
  }

  public UserServiceImpl() {
  }

  //  public void setUserDao(UserDao userDao) {
//    this.userDao = userDao;
//  }

  @Override
  public void save() {
    userDao.save();
  }
}
