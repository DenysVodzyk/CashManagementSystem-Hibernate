package com.example.hibernatetest.repository;

import com.example.hibernatetest.entity.Payment;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class PaymentRepo implements IPaymentRepo{

    @PersistenceContext
    private EntityManager em;

    @Override
    public Payment findById(int id) {
        return em.find(Payment.class, id);
    }
}
