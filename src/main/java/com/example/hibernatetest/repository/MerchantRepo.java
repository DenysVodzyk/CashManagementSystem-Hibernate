package com.example.hibernatetest.repository;

import com.example.hibernatetest.entity.Merchant;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class MerchantRepo implements IMerchantRepo {
    @PersistenceContext
    private EntityManager em;

    @Override
    public Merchant findById(int id) {
        return em.find(Merchant.class, id);
    }

    @Override
    public void save(Merchant merchant) {
        em.persist(merchant);
    }


}
