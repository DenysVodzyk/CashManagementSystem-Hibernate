package com.example.hibernatetest.service;

import com.example.hibernatetest.entity.Merchant;

public interface IMerchantService {
    public Merchant findById(int id);
}
