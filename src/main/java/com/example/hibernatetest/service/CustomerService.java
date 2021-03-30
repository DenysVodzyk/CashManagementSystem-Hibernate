package com.example.hibernatetest.service;

import com.example.hibernatetest.entity.Customer;
import com.example.hibernatetest.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@Service
public class CustomerService implements ICustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    @Override
    public Customer findById(int id) {
        return customerRepo.findById(id);
    }

    @Override
    @Transactional
    public void save(Customer customer) {
        customerRepo.save(customer);
    }

    @Override
    @Transactional
    public boolean remove(int id) {
        return customerRepo.remove(id);
    }

    @Override
    @Transactional
    public boolean remove(Customer customer) {
        return customerRepo.remove(customer);
    }

    @Override
    @Transactional
    public boolean updateCc(int id, String ccNumber) {
        Customer customer = findById(id);
        if (customer != null) {
            customer.setCcNo(ccNumber);
            return customerRepo.update(customer);
        }
        return false;
    }
}
