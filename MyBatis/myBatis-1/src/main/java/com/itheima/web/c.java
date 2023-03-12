package com.itheima.web;

import com.itheima.domain.User;
import com.itheima.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class c {
  public static void main(String[] args) throws IOException {
    /*
          一对多
     */
    InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
    SqlSession sqlSession = sqlSessionFactory.openSession();
    UserMapper mapper = sqlSession.getMapper(UserMapper.class);

    List<User> all = mapper.findAll2();
    for (User user : all) {
      System.out.println(user);
    }

    System.out.println("--------- 注解开发 ---------");

    List<User> userAndRoleAll = mapper.findUserAndOrderAll();
    for (User user : userAndRoleAll) {
      System.out.println(user);
    }

    sqlSession.close();
  }
}
