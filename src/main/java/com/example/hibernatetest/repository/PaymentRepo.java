package com.example.hibernatetest.repository;

import com.example.hibernatetest.entity.Customer;
import com.example.hibernatetest.entity.Payment;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.lang.reflect.Type;
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
    public List<Payment> selectByCustomerId(int id) {
        TypedQuery<Payment> query = em.createQuery("SELECT p FROM Payment p WHERE " +
                "p.customer.id = " + id, Payment.class);
        return query.getResultList();
    }

    @Override
    public double getPaymentsSum() {
        TypedQuery<Double> query = em.createQuery("SELECT  SUM(p.sumPaid) FROM Payment p", Double.class);
        return query.getSingleResult();
    }

    @Override
    public List<Payment> getPaymentsAboveLimit(double limit) {
        TypedQuery<Payment> query = em.createQuery("SELECT p FROM Payment  p WHERE " +
                "p.sumPaid > :limit", Payment.class);
        query.setParameter("limit", limit);
        return query.getResultList();
    }
}
