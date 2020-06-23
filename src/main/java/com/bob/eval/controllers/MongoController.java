package com.bob.eval.controllers;

import com.bob.eval.models.mongo.Customer;
import com.bob.eval.services.mongo.ICustomerMongoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *Author: Ibrahim Bou Ncoula
 */

@RestController
@RequestMapping(value = "/api/mongo", headers = "Accept=*/*",
        produces = "application/json", consumes="application/json")
public class MongoController {

    @Autowired
    private ICustomerMongoService customerService;

    @RequestMapping(value ="/customers", method = RequestMethod.GET)
    public List<Customer> getCustomers() {
        return customerService.findAll();
    }

    @RequestMapping(value ="/customers", method = RequestMethod.POST)
    public void createCustomers(@RequestBody Customer customer) {
        customerService.save(customer);
    }


}
