package com.framework.spring.repository;

import com.framework.spring.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {

  @Override
  public List<Customer> findAll() {
    List<Customer> customers = new ArrayList<>();

    customers.add(Customer.builder()
            .firstName("John")
            .lastName("Dean")
            .build());

    return customers;
  }

}

