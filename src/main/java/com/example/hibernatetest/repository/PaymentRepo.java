package com.example.hibernatetest.repository;

import com.example.hibernatetest.entity.Customer;
import com.example.hibernatetest.entity.Payment;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class PaymentRepo implements IPaymentRepo {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Payment findById(int id) {
        return em.find(Payment.class, id);
    }

    @Override
    public List<Customer> selectByCustomerId(int id) {
        TypedQuery<Customer> query = em.createQuery("SELECT c FROM Payment p, Customer c WHERE " +
                "p.customer.id = " + id, Customer.class);
        return query.getResultList();
    }
}
