package com.framework.spring.config;

import com.framework.spring.repository.CustomerRepository;
import com.framework.spring.repository.CustomerRepositoryImpl;
import com.framework.spring.service.CustomerService;
import com.framework.spring.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

  @Bean(name="customerService")
  public CustomerService getCustomerService() {
    return new CustomerServiceImpl(getCustomerRepository());
  }

  @Bean(name="customerRepository")
  public CustomerRepository getCustomerRepository() {
    return new CustomerRepositoryImpl();
  }

}
