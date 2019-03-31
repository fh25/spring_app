package com.framework.spring.service;

import com.framework.spring.model.Customer;

import java.util.List;

public interface CustomerService {
  List<Customer> findAll();
}
