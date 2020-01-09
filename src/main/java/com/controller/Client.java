package com.controller;


import com.factory.BeanFactory;
import com.service.AccountService;

public class Client {


    public static void main(String[] args) {
        for (int i=0;i<5;i++){

            AccountService as = (AccountService) BeanFactory.getBean("AccountService");
            as.saveAccout();
        }
//        accoutServiceImpl accoutService = new accoutServiceImpl();
    }

}
