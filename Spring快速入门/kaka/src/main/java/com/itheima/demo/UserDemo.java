//package com.itheima.demo;
//
//import com.itheima.dao.UserDao;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//public class UserDemo {
//  public static void main(String[] args) {
//    ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
//    UserDao userDao = (UserDao) app.getBean("userDao");  // u小写
//    userDao.save();
//  }
//}
