package com.bob.eval.services.solr;

import com.bob.eval.models.solr.Customer;

import java.util.List;

/**
 *Author: Ibrahim Bou Ncoula
 */

public interface ICustomerSolrService {
    List<Customer> getCustomers();
    void createCustomer(Customer customer);
    void deleteCustomer(String id);
}
