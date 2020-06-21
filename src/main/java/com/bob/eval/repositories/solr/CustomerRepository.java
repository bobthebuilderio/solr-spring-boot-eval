package com.bob.eval.repositories.solr;

import com.bob.eval.models.solr.Customer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.solr.repository.Query;
import org.springframework.data.solr.repository.SolrCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *Author: Ibrahim Bou Ncoula
 */

@Repository
@Qualifier("CustomerRepository")
public interface CustomerRepository extends SolrCrudRepository<Customer, String> {

    @Query(value = "*:*")
    List<Customer> getCustomers();

    //TODO: create more methods to use different types of search/queries in solr
    //TODO: Look into Highlights
    //TODO: Look into Facets

}