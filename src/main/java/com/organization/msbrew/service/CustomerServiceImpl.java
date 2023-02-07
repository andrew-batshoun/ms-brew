package com.organization.msbrew.service;

import com.organization.msbrew.model.CustomerDTO;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDTO getById(UUID customerId) {
        return CustomerDTO.builder()
                .id(UUID.randomUUID())
                .name("Bob")
                .build();
    }
}
