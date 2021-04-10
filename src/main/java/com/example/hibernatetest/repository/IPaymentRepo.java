package com.example.hibernatetest.repository;

import com.example.hibernatetest.entity.Payment;

public interface IPaymentRepo {
    public Payment findById(int id);
}
