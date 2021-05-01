package com.example.hibernatetest.service;

import com.example.hibernatetest.entity.Customer;
import com.example.hibernatetest.entity.Payment;

import java.util.List;

public interface IPaymentService {

    public Payment findById(int id);

    public List<Payment> selectByCustomerId(int id);

    public double getPaymentsSum();

    public List<Payment> getPaymentsAboveLimit(double limit);
}
