package com.service.impl;

import com.dao.AccountDao;
import com.factory.BeanFactory;
import com.service.AccountService;

public class AccountServiceImpl implements AccountService {

//    accountDaoImpl accountDao = new accountDaoImpl();
      /* int i =1;*/

    public void saveAccout() {
            int i =1;

        AccountDao AS = (AccountDao) BeanFactory.getBean("AccountDao");
        System.out.println("SERVICE 保存成功");
        AS.saveAccount();
        System.out.println(i);
        i++;


    }
}
