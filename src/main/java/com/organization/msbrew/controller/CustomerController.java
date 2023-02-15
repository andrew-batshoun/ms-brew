package com.organization.msbrew.controller;


import com.organization.msbrew.model.CustomerDTO;
import com.organization.msbrew.service.CustomerService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public ResponseEntity handlePost(@RequestBody CustomerDTO customer){
        CustomerDTO savedDTO = customerService.saveCustomer(customer);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/api/v1/customer" + savedDTO.getId().toString());

        return new ResponseEntity(headers, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity handleUpdate(@PathVariable UUID id, @RequestBody CustomerDTO customer){
        customerService.updateCustomer(id, customer);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }


    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void customerDelete(@PathVariable UUID id){

        customerService.delete(id);
    }

}
