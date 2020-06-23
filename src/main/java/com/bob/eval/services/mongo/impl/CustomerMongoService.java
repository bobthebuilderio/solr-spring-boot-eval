package com.bob.eval.services.mongo.impl;

import com.bob.eval.models.mongo.Customer;
import com.bob.eval.repositories.mongo.CustomerMongoRepository;
import com.bob.eval.services.mongo.ICustomerMongoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerMongoService implements ICustomerMongoService {

    @Autowired
    private CustomerMongoRepository customerRepository;

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void deleteAll() {
        customerRepository.deleteAll();
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
