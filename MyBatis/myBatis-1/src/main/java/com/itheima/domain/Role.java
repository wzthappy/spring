package com.itheima.domain;

public class Role {
  private int id;
  private String rolename;



  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getRolename() {
    return rolename;
  }

  public void setRolename(String rolename) {
    this.rolename = rolename;
  }

  @Override
  public String toString() {
    return "Role{" +
        "id=" + id +
        ", rolename='" + rolename + '\'' +
        '}';
  }
}
