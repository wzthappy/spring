package com.itheima.proxy.jdk;

import com.itheima.proxy.jdk.TargetInterface;

public class Target implements TargetInterface {
  @Override
  public void save() {
    System.out.println("save running....");
  }
}
