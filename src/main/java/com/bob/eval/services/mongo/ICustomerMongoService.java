package com.bob.eval.services.mongo;

import com.bob.eval.models.mongo.Customer;

import java.util.List;

public interface ICustomerMongoService {
    List<Customer> findAll();
    void deleteAll();
    void save(Customer customer);
}
