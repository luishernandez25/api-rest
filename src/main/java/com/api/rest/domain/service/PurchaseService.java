package com.api.rest.domain.service;

import com.api.rest.domain.Product;
import com.api.rest.domain.Purchase;
import com.api.rest.domain.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class PurchaseService {

    @Autowired
    private PurchaseRepository purchaseRepository;

    public List<Purchase> getAll (){
        return purchaseRepository.getAll();
    }

    public Optional<List<Purchase>> getByUser(String userid){
        return purchaseRepository.getByUser(userid);
    }

    public Purchase save (Purchase purchase){
        return purchaseRepository.save(purchase);
    }








}
