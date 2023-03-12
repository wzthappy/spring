package com.itheima.anno;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/**
 *    注解开发
 */

@Component("myAspect")
@Aspect  // 标注当前MyAspect是一个切面类
public class MyAspect {
  // 定义切点表达式
  @Pointcut("execution(* com.itheima.anno.*.*(..))")
  public void poinrcut() {}

  // 配置前置通知
//  @Before("execution(* com.itheima.anno.*.*(..))")
  @Before("poinrcut()")
  public void before() {
    System.out.println("前置增强.....11111");
  }

  // 配置后置通知
//  @AfterReturning("execution(* com.itheima.anno.*.*(..))")
  @AfterReturning("poinrcut()")
  public void aftweRetuming() {
    System.out.println("后置增强.....22222");
  }
}
