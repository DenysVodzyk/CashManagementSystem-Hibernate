package com.example.hibernatetest.repository;

import com.example.hibernatetest.entity.Customer;
import com.example.hibernatetest.entity.Payment;

import java.util.List;

public interface IPaymentRepo {
    public Payment findById(int id);

    public List<Customer> selectByCustomerId(int id);
}
