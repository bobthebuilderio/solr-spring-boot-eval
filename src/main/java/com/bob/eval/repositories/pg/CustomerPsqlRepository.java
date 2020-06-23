package com.bob.eval.repositories.pg;

import com.bob.eval.models.pg.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CustomerPsqlRepository extends JpaRepository<Customer, Long> {
}
