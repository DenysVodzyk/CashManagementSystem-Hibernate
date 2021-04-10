package com.example.hibernatetest.service;

import com.example.hibernatetest.entity.Payment;

public interface IPaymentService {

    public Payment findById(int id);
}
