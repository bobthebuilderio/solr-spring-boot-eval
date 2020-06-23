package com.bob.eval.models.mongo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Customers")
public class Customer {

    @Id
    public String id;

    public String name;
    public String gender;

    public Customer() {}

    public Customer(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%s, name='%s', gender='%s']",
                id, name, gender);
    }

}