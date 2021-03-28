package com.example.hibernatetest.repository;

import com.example.hibernatetest.entity.Customer;
import com.example.hibernatetest.entity.Merchant;

public interface IMerchantRepo {
    public Merchant findById(int id);

    public void save(Merchant merchant);
}
