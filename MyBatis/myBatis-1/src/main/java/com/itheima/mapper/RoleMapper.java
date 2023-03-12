package com.itheima.mapper;

import com.itheima.domain.Role;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface RoleMapper {
  @Select("select * from `sys-user-role` ur, role r where ur.roleId = r.id and ur.userId = #{uid}")
  List<Role> findByUid(int uid);
}
