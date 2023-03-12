package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {
  @Resource(name = "userDao")
  private UserDao userDao;

  @Override
  public void save() {
    userDao.save();
  }
}
