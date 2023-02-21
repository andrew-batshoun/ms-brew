package com.organization.msbrew.service.V2;

import com.organization.msbrew.model.V2.BeerDtoV2;

import java.util.UUID;

public interface BeerServiceV2 {
    BeerDtoV2 getBeerById(UUID beerId);

    BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto);

    void updateBeer(UUID beerid, BeerDtoV2 beerDto);

    void deleteById(UUID beerId);
}
