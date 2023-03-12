package com.itheima.web;

import com.itheima.domain.Orders;
import com.itheima.mapper.OrdersMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class b {
  public static void main(String[] args) throws IOException {
    /*
          一对一
     */
    InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
    SqlSession sqlSession = sqlSessionFactory.openSession();
    OrdersMapper mapper = sqlSession.getMapper(OrdersMapper.class);

    List<Orders> all = mapper.findAll();
    for (Orders orders : all) {
      System.out.println(orders);
    }

//    sqlSession.close();
    System.out.println("--------- 注解开发 ---------");

    List<Orders> all3 = mapper.findAll3();
    for (Orders orders : all3) {
      System.out.println(orders);
    }

    sqlSession.close();
  }
}
