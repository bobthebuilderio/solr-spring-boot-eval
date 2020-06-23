package com.bob.eval.controllers;

import com.bob.eval.models.solr.Customer;
import com.bob.eval.services.solr.ICustomerSolrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *Author: Ibrahim Bou Ncoula
 */

@RestController
@RequestMapping(value = "/api/solr", headers = "Accept=*/*",
        produces = "application/json", consumes="application/json")
public class SolrController {

    @Autowired
    private ICustomerSolrService customerService;

    @RequestMapping(value ="/customers", method = RequestMethod.GET)
    public List<Customer> getCustomers() {
        return customerService.getCustomers();
    }

    @RequestMapping(value ="/customers", method = RequestMethod.POST)
    public void createCustomers(@RequestBody Customer customer) {
        customerService.createCustomer(customer);
    }

    @RequestMapping(value ="/customers", method = RequestMethod.DELETE)
    public void deleteCustomers(@RequestParam(required = false) String id) {
        customerService.deleteCustomer(id);
    }
}
