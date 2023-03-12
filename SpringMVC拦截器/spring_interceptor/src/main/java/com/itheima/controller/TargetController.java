package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TargetController {

  @RequestMapping("/target")
  public ModelAndView show() throws Exception {
    System.out.println("目标资源执行......");
    int i = Integer.getInteger("jdasiid");   // 报错
    System.out.println(i);
    ModelAndView modelAndView = new ModelAndView();
    modelAndView.addObject("name", "itcast");
    modelAndView.setViewName("index");
    return modelAndView;
  }
}
