package com.itheima.web;

import com.itheima.config.SeringConfiguration;
import com.itheima.domain.User;
import com.itheima.service.ServiceDemo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class a {
  public static void main(String[] args) {
    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SeringConfiguration.class);
    ServiceDemo bean = applicationContext.getBean(ServiceDemo.class);

    List<User> all = bean.findAll();
    for (User user : all) {
      System.out.println(user);
    }
  }
}
