package com.example.hibernatetest.service;

import com.example.hibernatetest.entity.Customer;

import java.util.List;

public interface ICustomerService {
    public Customer findById(int id);

    public void save(Customer customer);

    public boolean remove(int id);

    public boolean remove(Customer customer);

    public boolean updateCc(int id, String ccNumber);

    public List<String> getNamesBySumPaid(double sumPaid);
}
