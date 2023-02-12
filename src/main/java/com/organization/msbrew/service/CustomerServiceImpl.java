package com.organization.msbrew.service;

import com.organization.msbrew.model.CustomerDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDTO getById(UUID customerId) {
        return CustomerDTO.builder()
                .id(UUID.randomUUID())
                .name("Bob")
                .build();
    }

    @Override
    public CustomerDTO saveCustomer(CustomerDTO customer) {
        return CustomerDTO.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateCustomer(UUID id, CustomerDTO customer) {
        //todo impl - would have real
    }

    @Override
    public void delete(UUID id) {
        log.debug("Deleting customer....");
    }
}
