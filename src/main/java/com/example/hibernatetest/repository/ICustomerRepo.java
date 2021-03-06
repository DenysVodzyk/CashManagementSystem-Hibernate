package com.example.hibernatetest.repository;

import com.example.hibernatetest.entity.Customer;

import java.util.List;

public interface ICustomerRepo {
    public Customer findById(int id);

    public void save(Customer customer);

    public boolean remove(int id);

    public boolean remove(Customer customer);

    public boolean update(Customer customer);

    public List<String> getNamesBySumPaid(double sumPaid);
}
