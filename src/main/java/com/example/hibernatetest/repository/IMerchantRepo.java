package com.example.hibernatetest.repository;

import com.example.hibernatetest.entity.Customer;
import com.example.hibernatetest.entity.Merchant;
import com.example.hibernatetest.entity.dto.Result;

import java.util.List;

public interface IMerchantRepo {
    public Merchant findById(int id);

    public void save(Merchant merchant);

    public List<Result> getTotalReport();

    public List<Merchant> getSortedByNeedToPay();

    public List<Merchant> findAll();
}
