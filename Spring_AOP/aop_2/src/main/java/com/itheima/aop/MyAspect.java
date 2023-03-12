package com.itheima.aop;

import org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint;

public class MyAspect {
  public void before() {
    System.out.println("前置增强.....11111");
  }
  public void aftweRetuming() {
    System.out.println("后置增强.....22222");
  }
}
