package com.organization.msbrew.service;

import com.organization.msbrew.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
