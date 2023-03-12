package com.itheima.controller;

import com.alibaba.fastjson.JSON;
import com.itheima.domain.User;
import com.itheima.domain.VO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Base64;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/user")  // 如果加上了这，就是根目录      访问路径就要是/user/quick 了
public class UserController {
  //    访问这个路径必须要右username参数
  @RequestMapping(value = "/quick", method = RequestMethod.GET, params = {"username"})  // 访问路径
  public String save() {
    System.out.println("Controller save runing....");
    return "../jsp/success.jsp";  // 要访问的资源文件，和转发(地址不变)一样    因为资源没有在user包中，所以访问路径要向前移一步
//    return "redirect:../jsp/success.jsp";  // 和重定向一样
  }

  @RequestMapping(value = "/quick18")  // 访问路径
  @ResponseBody  // 告诉SpringMVC框架 不要页面跳转，直接进行数据响应
  public String save18(String username, MultipartFile uploadFile) throws IOException {
    System.out.println(username);
    System.out.println(uploadFile);
    // 获得上传文件的名称
    String originalFilename = uploadFile.getOriginalFilename();
    // 把文件上传到对应位置
    uploadFile.transferTo(new File("F:\\Java代码\\untitled\\src\\Spring\\Spring集成web_mvc\\mvc\\src\\main\\webapp\\img\\" + originalFilename));

    return originalFilename;  // 主要是方便查看
  }

  @RequestMapping(value = "/quick17")  // 访问路径
  @ResponseBody  // 告诉SpringMVC框架 不要页面跳转，直接进行数据响应
  public Date save17(Date date) {
    System.out.println(date);
    return date;
  }

  @RequestMapping(value = "/quick16/{name}")  // 访问路径
  @ResponseBody  // 告诉SpringMVC框架 不要页面跳转，直接进行数据响应
  public String save16(@PathVariable("name") String username) {
    System.out.println(username);
    return username;
  }

  @RequestMapping(value = "/quick15")  // 访问路径
  @ResponseBody  // 告诉SpringMVC框架 不要页面跳转，直接进行数据响应
  public String save15(@RequestParam(value = "name", required = false, defaultValue = "吱吱吱吱") String username) {
    System.out.println(username);
    return username;
  }

  @RequestMapping(value = "/quick14")  // 访问路径
  @ResponseBody  // 告诉SpringMVC框架 不要页面跳转，直接进行数据响应
  public List<User> save14(@RequestBody List<User> userList) {
    System.out.println(userList);
    return userList;
  }

  @RequestMapping(value = "/quick13")  // 访问路径
  @ResponseBody  // 告诉SpringMVC框架 不要页面跳转，直接进行数据响应
  public VO save13(VO vo) {
    return vo;
  }

  @RequestMapping(value = "/quick12")  // 访问路径
  @ResponseBody  // 告诉SpringMVC框架 不要页面跳转，直接进行数据响应
  public String[] save12(String[] str) {
    System.out.println(Arrays.toString(str));
    return str;   // 这只是方便好看到数据    已经配置了自动转换json数据了
  }

  @RequestMapping(value = "/quick11")  // 访问路径
  @ResponseBody  // 告诉SpringMVC框架 不要页面跳转，直接进行数据响应
  public User save11(User user) {
    System.out.println(user);
    return user;  // 这只是方便好看到数据    已经配置了自动转换json数据了
  }

  @RequestMapping(value = "/quick10")  // 访问路径
  @ResponseBody  // 告诉SpringMVC框架 不要页面跳转，直接进行数据响应
  public String save10(String username, Integer age) {
    System.out.println(username + age);
    return username + age;
  }

  @RequestMapping(value = "/quick9")  // 访问路径
  @ResponseBody  // 告诉SpringMVC框架 不要页面跳转，直接进行数据响应
  // 期望SpringMVC自动将User转换成json格式字符串
  public User save9() {
    User user = new User();
    user.setName("众多的");
    user.setAge(23);
    return user;
  }

  @RequestMapping(value = "/quick8")  // 访问路径
  @ResponseBody  // 告诉SpringMVC框架 不要页面跳转，直接进行数据响应
  public String save8() {
    User user = new User();
    user.setName("众多的");
    user.setAge(23);
    // 使用json的转换工具将对象转换成json格式字符串在返回
    String s = JSON.toJSONString(user);
    return s;
  }

  @RequestMapping(value = "/quick7")  // 访问路径
  @ResponseBody  // 告诉SpringMVC框架 不要页面跳转，直接进行数据响应
  public String save7() {
    return "hello itheima";
  }

  @RequestMapping(value = "/quick6")  // 访问路径
  public void save6(HttpServletRequest request, HttpServletResponse response) throws IOException {
    response.setContentType("text/html;charset=utf-8");
    response.getWriter().print("中国广告广告");
  }


  @RequestMapping(value = "/quick5")  // 访问路径
  public String save5(HttpServletRequest request, HttpServletResponse response) {
    request.setAttribute("username", "大大苏打");
    return "../jsp/success.jsp";
  }

  @RequestMapping(value = "/quick4")  // 访问路径
  public String save4(Model model) {
    model.addAttribute("username", "看得见啊看附件两款");
    return "../jsp/success.jsp";
  }

  @RequestMapping(value = "/quick3")  // 访问路径
  public ModelAndView save3(ModelAndView modelAndView) {
    modelAndView.addObject("username", "看看看看");
    // 设置视图名称
    modelAndView.setViewName("../jsp/success.jsp");
    return modelAndView;
  }

  @RequestMapping(value = "/quick2")  // 访问路径
  public ModelAndView save2() {
    /*
          Mode:  模型  作用封装数据
          View:  视图  作用展示数据
     */
    ModelAndView modelAndView = new ModelAndView();
    // 设置模型数据
    modelAndView.addObject("username", "长官刚刚");
    // 设置视图名称
    modelAndView.setViewName("../jsp/success.jsp");
    return modelAndView;
  }
}
