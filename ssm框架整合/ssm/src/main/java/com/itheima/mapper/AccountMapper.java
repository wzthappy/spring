package com.itheima.mapper;

import com.itheima.domain.Account;

import java.util.List;

public interface AccountMapper {


  void save(Account account);


  List<Account> findAll();
}
