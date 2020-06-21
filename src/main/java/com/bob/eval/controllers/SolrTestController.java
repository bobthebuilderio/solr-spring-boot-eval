package com.bob.eval.controllers;

import com.bob.eval.models.solr.Customer;
import com.bob.eval.services.solr.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 *Author: Ibrahim Bou Ncoula
 */

@RestController
@RequestMapping(value = "/api/solr", headers = "Accept=*/*",
        produces = "application/json", consumes="application/json")
public class SolrTestController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value ="/customers", method = RequestMethod.GET)
    public List<Customer> getCustomers() {
        return customerService.getCustomers();
    }

    @RequestMapping(value ="/customers", method = RequestMethod.POST)
    public void createCustomers(@RequestBody Customer customer) {
        customerService.createCustomer(customer);
    }
}
