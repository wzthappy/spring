package com.itheima.service.impl;

import com.itheima.domain.User;
import com.itheima.mapper.UserMapper;
import com.itheima.service.ServiceDemo;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("serviceUser")
public class UserServiceImpl implements ServiceDemo {
  UserMapper mapper;

  @Resource(name = "sqlSession")
  SqlSession sqlSession;

  @Override
  public List<User> findAll() {
    mapper = sqlSession.getMapper(UserMapper.class);
    // 设置分页的相关参数      当前页   每页显示的条数
//    PageHelper.startPage(2, 3);

    List<User> all = mapper.findAll();

    sqlSession.close();
    return all;
  }
}
