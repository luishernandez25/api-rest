package com.api.rest.domain.repository;

import com.api.rest.domain.Purchase;

import java.util.List;
import java.util.Optional;

public interface PurchaseRepository {

    List<Purchase> getAll();
    Optional <List<Purchase>> getByUser(String userId);
    Purchase save(Purchase purchase);


}
