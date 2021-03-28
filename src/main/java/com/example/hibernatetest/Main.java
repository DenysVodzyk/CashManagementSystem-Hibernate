package com.example.hibernatetest;

import com.example.hibernatetest.entity.Customer;
import com.example.hibernatetest.entity.Merchant;
import com.example.hibernatetest.service.CustomerService;
import com.example.hibernatetest.service.ICustomerService;
import com.example.hibernatetest.service.IMerchantService;
import com.example.hibernatetest.service.MerchantService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        IMerchantService merchantService = context.getBean(IMerchantService.class);
        ICustomerService customerService = context.getBean(ICustomerService.class);

        System.out.println(merchantService.findById(1));
        System.out.println(customerService.findById(1));

        Customer elon = new Customer("Elon Musk", "3500 Deer Creek, Palo Alto, CA 94304",
                "NAsales@teslamotors.com", "1111111111111111", "Visa", java.sql.Date.valueOf("2022-10-22"));
        Merchant merchant = new Merchant("Steven", "Scotia", "AA245BXW", "247991002", 5.1,
                1, 100.0, 50.0, 1.0, java.sql.Date.valueOf("2022-10-22"));


//        customerService.save(elon);
        System.out.println("Id: " + elon.getId());
//
//        merchantService.save(merchant);
//        System.out.println("Id: " + merchant.getId());
//
//        System.out.println(customerService.remove(15));

        System.out.println(customerService.remove(customerService.findById(21)));
    }
}
