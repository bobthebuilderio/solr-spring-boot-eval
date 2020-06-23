package com.bob.eval.services.pg;

import com.bob.eval.models.pg.Customer;

import java.util.List;

public interface ICustomerPsqlService {
    List<Customer> findAll();
}
