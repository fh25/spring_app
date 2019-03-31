package com.framework.spring.config;

import com.framework.spring.service.CustomerService;
import com.framework.spring.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.framework.spring"})
public class AppConfig {

  @Bean(name="customerService")
  public CustomerService getCustomerService() {
    return new CustomerServiceImpl();
  }

//  @Bean(name="customerRepository")
//  public CustomerRepository getCustomerRepository() {
//    return new CustomerRepositoryImpl();
//  }

}
