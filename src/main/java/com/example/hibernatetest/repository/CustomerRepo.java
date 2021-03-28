package com.example.hibernatetest.repository;

import com.example.hibernatetest.entity.Customer;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class CustomerRepo implements ICustomerRepo {
    @PersistenceContext
    private EntityManager em;

    @Override
    public Customer findById(int id) {
        return em.find(Customer.class, id);
    }

    @Override
    public void save(Customer customer) {
        em.persist(customer);
    }

    @Override
    public boolean remove(int id) {
        Customer customer = findById(id);

        if (customer != null) {
            em.remove(customer);
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(Customer customer) {
        if (customer != null) {
            em.remove(customer);
            return true;
        }
        return false;
    }
}
