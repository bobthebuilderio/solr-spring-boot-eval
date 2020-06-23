package com.bob.eval.controllers;

import com.bob.eval.models.pg.Customer;
import com.bob.eval.services.pg.ICustomerPsqlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *Author: Ibrahim Bou Ncoula
 */

@RestController
@RequestMapping(value = "/api/psql", headers = "Accept=*/*",
        produces = "application/json", consumes="application/json")
public class PsqlController {

    @Autowired
    private ICustomerPsqlService customerService;

    @RequestMapping(value ="/customers", method = RequestMethod.GET)
    public List<Customer> getCustomers() {
        return customerService.findAll();
    }

}
