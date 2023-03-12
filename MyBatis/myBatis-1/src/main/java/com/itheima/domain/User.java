package com.itheima.domain;

import java.util.List;

public class User {
  private Integer id;
  private String username;
  private String password;

  // 描述的是当前用户存在那些订单    一对多
  private List<Orders> ordersList;

  // 描述的是当前用户具备那些角色   多对多
  private List<Role> roleList;








  public List<Role> getRoleList() {
    return roleList;
  }

  public void setRoleList(List<Role> roleList) {
    this.roleList = roleList;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public List<Orders> getOrdersList() {
    return ordersList;
  }

  public void setOrdersList(List<Orders> ordersList) {
    this.ordersList = ordersList;
  }

  public Integer getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public String toString() {
    return "User{" +
        "id=" + id +
        ", username='" + username + '\'' +
        ", password='" + password + '\'' +
        ", ordersList=" + ordersList +
        ", roleList=" + roleList +
        '}';
  }
}
