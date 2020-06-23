package com.bob.eval.services.pg.impl;

import com.bob.eval.models.pg.Customer;
import com.bob.eval.repositories.pg.CustomerPsqlRepository;
import com.bob.eval.services.pg.ICustomerPsqlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerPsqlService implements ICustomerPsqlService {

    @Autowired
    CustomerPsqlRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return (List<Customer>) customerRepository.findAll();
    }
}
