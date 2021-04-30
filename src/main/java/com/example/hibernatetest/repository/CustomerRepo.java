package com.example.hibernatetest.repository;

import com.example.hibernatetest.entity.Customer;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

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
        if (customer.getId() == 0) {
            em.persist(customer);
        } else {
            em.merge(customer);
        }
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

    @Override
    public boolean update(Customer customer) {
        return customer != null;
    }

    @Override
    public List<String> getNamesBySumPaid(double sumPaid) {
        TypedQuery<String> query = em.createQuery("SELECT DISTINCT c.name FROM Payment p, Customer c WHERE " +
                "c.id = p.customer.id AND p.sumPaid > " + sumPaid, String.class);
        return query.getResultList();
    }
}
