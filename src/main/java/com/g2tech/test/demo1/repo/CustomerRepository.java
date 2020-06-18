package com.g2tech.test.demo1.repo;
import java.util.List;

import com.g2tech.test.demo1.domain.Customer;
import org.springframework.data.repository.CrudRepository;



    public interface CustomerRepository extends CrudRepository<Customer, Long> {

        List<Customer> findByLastName(String lastName);

        Customer findById(long id);
    }

