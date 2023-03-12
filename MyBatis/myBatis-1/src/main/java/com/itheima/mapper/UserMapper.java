package com.itheima.mapper;

import com.itheima.domain.Orders;
import com.itheima.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {
  // 一对多
  List<User> findAll2();

  // 多对多
  List<User> findUserAndRoleAll();


  // 注解开发
  // 一对多
  @Select("select * from user")
  @Results({
      @Result(id = true, column = "id", property = "id"),
      @Result(column = "username", property = "username"),
      @Result(column = "password", property = "password"),
      @Result(
          property = "ordersList",
          column = "id",
          javaType = List.class,
          many = @Many(select = "com.itheima.mapper.OrdersMapper.findByUid")
      )
  })
  List<User> findUserAndOrderAll();

  // 多对多
  @Select("select * from user")
  @Results({
      @Result(id = true, column = "id", property = "id"),
      @Result(id = true, column = "username", property = "username"),
      @Result(id = true, column = "password", property = "password"),
      @Result(
          property = "roleList",
          column = "id",
          javaType = List.class,
          many = @Many(select = "com.itheima.mapper.RoleMapper.findByUid")
      )
  })
  List<User> findUserAndRoleAll2();





  @Select("select * from user where id = #{id}")
  User findById(int id);

  //查询
  @Select("select * from user")
  List<User> findAll();

  // 插入
  @Insert("insert into user values (null, #{username}, #{password})")
  int save(User user);

  // 修改
  int update(User user);

  // 删除
  @Delete("delete from user where id = #{id}")
  int delete(@Param("id") int id);
}
