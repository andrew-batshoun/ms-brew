package com.organization.msbrew.service;

import com.organization.msbrew.model.CustomerDTO;

import java.util.UUID;

public interface CustomerService  {

    CustomerDTO getById(UUID customerId);
}
