package com.framework.spring.repository;

import com.framework.spring.model.Customer;

import java.util.List;

public interface CustomerRepository {
  List<Customer> findAll();
}
