package com.department;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class DepartmentServiceApplication {

  public static void main(String[] args) {
    System.out.println("Department service");
    SpringApplication.run(DepartmentServiceApplication.class, args);
  }

}