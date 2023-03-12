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

public class d {
  public static void main(String[] args) throws IOException {
    /*
          多对多
     */
    InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
    SqlSession sqlSession = sqlSessionFactory.openSession();
    UserMapper mapper = sqlSession.getMapper(UserMapper.class);

    List<User> all = mapper.findUserAndRoleAll();
    for (User user : all) {
      System.out.println(user);
    }

    System.out.println("--------- 注解开发 ---------");

    List<User> userAndRoleAll2 = mapper.findUserAndRoleAll2();
    for (User user : userAndRoleAll2) {
      System.out.println(user);
    }

    sqlSession.close();
  }
}
