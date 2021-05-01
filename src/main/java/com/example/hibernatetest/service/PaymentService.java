package com.example.hibernatetest.service;

import com.example.hibernatetest.entity.Customer;
import com.example.hibernatetest.entity.Payment;
import com.example.hibernatetest.repository.PaymentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PaymentService implements IPaymentService {
    @Autowired
    private PaymentRepo paymentRepo;

    @Override
    public Payment findById(int id) {
        return paymentRepo.findById(id);
    }

    @Override
    public List<Payment> selectByCustomerId(int id) {
        return paymentRepo.selectByCustomerId(id);
    }

    @Override
    public double getPaymentsSum() {
        return paymentRepo.getPaymentsSum();
    }

    @Override
    public List<Payment> getPaymentsAboveLimit(double limit) {
        return paymentRepo.getPaymentsAboveLimit(limit);
    }


}
