package com.itheima.domain;

import java.util.Date;

public class Orders {
  private int id;
  private Date ordrtime;
  private double total;

  // 表示当前订单属于那一个用户
  private User user;    // uid     一对一




  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Date getOrdrtime() {
    return ordrtime;
  }

  public void setOrdrtime(Date ordrtime) {
    this.ordrtime = ordrtime;
  }

  public double getTotal() {
    return total;
  }

  public void setTotal(double total) {
    this.total = total;
  }

  @Override
  public String toString() {
    return "Orders{" +
        "id=" + id +
        ", ordrtime=" + ordrtime +
        ", total=" + total +
        ", user=" + user +
        '}';
  }
}
