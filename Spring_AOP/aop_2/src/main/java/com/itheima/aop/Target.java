package com.itheima.aop;

public class Target implements TargetInterface {
  @Override
  public void save() {
    System.out.println("save running....");
  }
}
