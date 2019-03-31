package com.framework.spring.config;

import com.framework.spring.repository.CustomerRepository;
import com.framework.spring.repository.CustomerRepositoryImpl;
import com.framework.spring.service.CustomerService;
import com.framework.spring.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan({"com.framework.spring"})
@PropertySource("app.properties")
public class AppConfig {

  @Bean
  public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceHolerConfigurer() {
    return new PropertySourcesPlaceholderConfigurer();
  }

//  @Bean(name="customerService")
//  public CustomerService getCustomerService() {
//    return new CustomerServiceImpl();
//  }

//  @Bean(name="customerRepository")
//  public CustomerRepository getCustomerRepository() {
//    return new CustomerRepositoryImpl();
//  }

}
