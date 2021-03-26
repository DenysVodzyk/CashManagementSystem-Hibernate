package com.example.hibernatetest.repository;

import com.example.hibernatetest.entity.Merchant;

public interface IMerchantRepo {
    public Merchant findById(int id);
}
