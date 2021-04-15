package com.example.hibernatetest.service;

import com.example.hibernatetest.entity.Merchant;
import com.example.hibernatetest.entity.dto.Result;

import java.util.List;

public interface IMerchantService {
    public Merchant findById(int id);

    public void save(Merchant merchant);

    public List<Result> getTotalReport();

    public List<Merchant> getSortedByNeedToPay();
}
