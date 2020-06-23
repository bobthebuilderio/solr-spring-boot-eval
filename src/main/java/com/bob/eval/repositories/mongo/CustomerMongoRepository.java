package com.bob.eval.repositories.mongo;

import java.util.List;

import com.bob.eval.models.mongo.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerMongoRepository extends MongoRepository<Customer, String> {
    public Customer findByName(String name);
    public List<Customer> findByGender(String gender);
}
