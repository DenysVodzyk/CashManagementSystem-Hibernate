package com.example.hibernatetest.repository;

import com.example.hibernatetest.entity.Merchant;
import com.example.hibernatetest.entity.dto.Result;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

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

    @Override
    public List<Result> getTotalReport() {
        String txt = "SELECT new com.example.hibernatetest.entity.dto.Result (p.merchant.name," +
                " SUM(p.chargePaid), count(p)) FROM Payment p GROUP BY p.merchant.name";
        TypedQuery<Result> query = em.createQuery(txt, Result.class);
        return query.getResultList();
    }

    @Override
    public List<Merchant> getSortedByNeedToPay() {
        String txt = "SELECT m FROM Merchant m ORDER BY m.needToSend";
        TypedQuery<Merchant> query = em.createQuery(txt, Merchant.class);
        return query.getResultList();
    }

    @Override
    public List<Merchant> findAll() {
        TypedQuery<Merchant> query = em.createQuery("SELECT m FROM Merchant m", Merchant.class);
        return query.getResultList();
    }


}
