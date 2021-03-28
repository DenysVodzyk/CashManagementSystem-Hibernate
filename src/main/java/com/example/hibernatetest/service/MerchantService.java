package com.example.hibernatetest.service;

import com.example.hibernatetest.entity.Merchant;
import com.example.hibernatetest.repository.MerchantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class MerchantService implements IMerchantService {
    @Autowired
    private MerchantRepo merchantRepo;

    @Override
    public Merchant findById(int id) {
        return merchantRepo.findById(id);
    }

    @Override
    @Transactional
    public void save(Merchant merchant) {
        merchantRepo.save(merchant);
    }
}
