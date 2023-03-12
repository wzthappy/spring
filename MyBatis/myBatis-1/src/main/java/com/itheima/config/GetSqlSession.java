package com.itheima.config;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.io.InputStream;

public class GetSqlSession {
  public GetSqlSession() throws IOException {
  }
  InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
  SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);

  SqlSession sqlSession = sqlSessionFactory.openSession();

  @Bean("sqlSession")
  public SqlSession getUserMapper() {
    return sqlSession;
  }
}
