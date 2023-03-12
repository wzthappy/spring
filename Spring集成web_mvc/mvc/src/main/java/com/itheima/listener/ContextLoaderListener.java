package com.itheima.listener;

import com.itheima.config.SeringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextLoaderListener implements ServletContextListener {
  @Override
  public void contextInitialized(ServletContextEvent sce) {  // 创建
    ServletContext servletContext = sce.getServletContext();
    // 读取web.xml中的全局参数
    String contextConfigLocation = servletContext.getInitParameter("contextConfigLocation");

    ApplicationContext app = new AnnotationConfigApplicationContext(SeringConfiguration.class);
//    ApplicationContext app = new ClassPathXmlApplicationContext(contextConfigLocation);
//    ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");

    // 将Spring的应用上下文对象存储到ServletContext域中(全局作用域)
    servletContext.setAttribute("app", app);
  }

  @Override
  public void contextDestroyed(ServletContextEvent sce) {  // 销毁
  }
}
