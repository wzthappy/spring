package com.itheima.web.servlet;

import com.itheima.service.UserService;
import org.springframework.context.ApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserServlet extends HttpServlet  {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//    ApplicationContext app = new AnnotationConfigApplicationContext(SeringConfiguration.class);
    ServletContext servletContext = req.getServletContext(); // 获取全局中用域
//    ServletContext servletContext1 = this.getServletContext();  // this也可以获取
    ApplicationContext app = (ApplicationContext) servletContext.getAttribute("app");

    System.out.println("spring容器创建完毕....");

    UserService bean = app.getBean(UserService.class);
    bean.save();
  }
}
