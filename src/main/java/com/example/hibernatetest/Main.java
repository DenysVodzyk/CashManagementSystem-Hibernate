package com.example.hibernatetest;

import com.example.hibernatetest.entity.Customer;
import com.example.hibernatetest.entity.Merchant;
import com.example.hibernatetest.entity.Payment;
import com.example.hibernatetest.entity.dto.Result;
import com.example.hibernatetest.service.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        IMerchantService merchantService = context.getBean(IMerchantService.class);
        ICustomerService customerService = context.getBean(ICustomerService.class);
        IPaymentService paymentService = context.getBean(IPaymentService.class);

        List<Payment> payments = paymentService.getPaymentsAboveLimit(1500);
        payments.forEach(System.out::println);


//        System.out.println(paymentService.getPaymentsSum());

//        List<Payment> payments = paymentService.selectByCustomerId(3);
//        payments.forEach(System.out::println);

//        List<String> list = customerService.getNamesBySumPaid(500);
//        list.forEach(System.out::println);


//        List<Merchant> merchants = merchantService.findAll();
//        for (Merchant m : merchants) {
//            System.out.println("name=" + m.getName() + ", charge = " + m.getCharge());
//        }
//
//                Payment p = paymentService.findById(2);
//        Merchant merchant1 = merchantService.findById(1);
//        Customer customer1 = customerService.findById(1);


//        System.out.println(merchant1);
//        System.out.println(customer1);
//
//        System.out.println(p);


//        if (customer1 != null) {
//            System.out.println(customer1);
//            Collection<Merchant> merchants = customer1.getMerchants();
//            for (Merchant m : merchants) {
//                System.out.println(m.getName());
//            }
//        }

//        List<Merchant> list = merchantService.getSortedByNeedToPay();
//        for (Merchant m : list) {
//            System.out.println("=====================");
//            System.out.println(m.getName());
//        }


//        List<Result> list = merchantService.getTotalReport();
//        for (Result r : list) {
//            System.out.format("%s, %8.2f\n", r.getName(), r.getSum());
//        }


//        Customer elon = new Customer("Elon Musk", "3500 Deer Creek, Palo Alto, CA 94304",
//                "NAsales@teslamotors.com", "1111111111111111", "Visa", java.sql.Date.valueOf("2022-10-22"));
//        Merchant merchant = new Merchant("Steven", "Scotia", "AA245BXW", "247991002", 5.1,
//                1, 100.0, 50.0, 1.0, java.sql.Date.valueOf("2022-10-22"));


//        customerService.save(elon);
//        System.out.println("Id: " + elon.getId());
//
//        merchantService.save(merchant);
//        System.out.println("Id: " + merchant.getId());
//
//        System.out.println(customerService.remove(15));

//        System.out.println("Customer 2 update: " + customerService.updateCc(2, "255555555555"));
//
//        System.out.println(customerService.findById(2));


    }
}
