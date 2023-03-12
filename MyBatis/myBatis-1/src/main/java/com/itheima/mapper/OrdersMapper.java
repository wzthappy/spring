package com.itheima.mapper;

import com.itheima.domain.Orders;
import com.itheima.domain.User;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface OrdersMapper {

  @Select("select * from orders where uid = #{uid}")
  List<Orders> findByUid(int uid);

  /*
      多表查询的
 */
  // 一对一
  List<Orders> findAll();


  // 注解开发
  // 一对一
  @Select("select * from orders")
  @Results({
      @Result(column = "oid", property = "id"),
      @Result(column = "ordrtime", property = "ordrtime"),
      @Result(column = "total", property = "total"),
      @Result(
          property = "user", // 要封装的属性名称
          column = "uid",  // 根据来个字段去查询user表的数据
          javaType = User.class, // 要封装的实体 类型
          one = @One(select = "com.itheima.mapper.UserMapper.findById")  // select属性 代表查询那个接口的方法获得数据
      )
  })
  List<Orders> findAll3();
  // 或  -->
//  @Select("select *, o.id oid from user u join orders o where u.id = o.uid")
//  @Results({
//      @Result(column = "oid", property = "id"),
//      @Result(column = "ordrtime", property = "ordrtime"),
//      @Result(column = "total", property = "total"),
//      @Result(column = "uid", property = "user.id"),
//      @Result(column = "username", property = "user.username"),
//      @Result(column = "password", property = "user.password"),
//  })
//  List<Orders> findAll3();

}
