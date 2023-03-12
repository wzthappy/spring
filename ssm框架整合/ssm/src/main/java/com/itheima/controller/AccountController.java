package com.itheima.controller;

import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {

  @Autowired
  private AccountService accountService;

  // 保存
  @RequestMapping(value = "/save", produces = "text/html;charset=UTF-8")
  @ResponseBody   // 告诉SpringMVC框架 不要页面跳转，直接进行数据响应
  public String save(Account account) {
    accountService.save(account);
    return "保存成功";
  }

  // 查询
  @RequestMapping("/findAll")
  public ModelAndView findAll() {
    List<Account> all = accountService.findAll();
    ModelAndView modelAndView = new ModelAndView();
    modelAndView.addObject("accountList", all);
    modelAndView.setViewName("accountList");
    return modelAndView;
  }
}
