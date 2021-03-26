package com.example.hibernatetest;

import com.example.hibernatetest.entity.Merchant;
import com.example.hibernatetest.service.MerchantService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        MerchantService merchantService = context.getBean(MerchantService.class);
        Merchant m1 = merchantService.findById(1);
        System.out.println(m1);
    }
}
