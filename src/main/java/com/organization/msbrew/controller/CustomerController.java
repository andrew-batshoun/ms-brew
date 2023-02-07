package com.organization.msbrew.controller;


import com.organization.msbrew.model.CustomerDTO;
import com.organization.msbrew.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping("/api/v1/customer")
@RestController
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }


    @GetMapping("/{customerId}")
    public ResponseEntity<CustomerDTO> getCustomer(@PathVariable UUID customerId){
        return new ResponseEntity<>(customerService.getById(customerId), HttpStatus.OK);
    }
}