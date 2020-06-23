package com.bob.eval.services.solr.impl;

import com.bob.eval.models.solr.Customer;
import com.bob.eval.repositories.solr.CustomerSolrRepository;
import com.bob.eval.services.solr.ICustomerSolrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *Author: Ibrahim Bou Ncoula
 */

@Service
public class CustomerSolrService implements ICustomerSolrService {

    @Autowired
    private CustomerSolrRepository customerRepository;

    @Override
    public List<Customer> getCustomers() {
        return customerRepository.getCustomers();
    }

    @Override
    public void createCustomer(Customer customer) {
        //TODO: better to throw something here instead
        if(customer == null){
            return;
        }

        customerRepository.save(customer);
    }

    @Override
    public void deleteCustomer(String id) {
        //TODO: better to throw something here instead
        if(id == null || id.equals("")) {
            //TODO: This is just temporary to help me clean the index when needed.
            customerRepository.deleteAll();
        }

        customerRepository.deleteById(id);
    }
}
