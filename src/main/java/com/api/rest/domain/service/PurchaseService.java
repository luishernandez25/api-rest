package com.api.rest.domain.service;

import com.api.rest.domain.Purchase;
import com.api.rest.domain.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PurchaseService {

    @Autowired
    private PurchaseRepository purchaseRepository;

    public List<Purchase> getAll (){
        return purchaseRepository.getAll();
    }

    public Optional<List<Purchase>> getByUser(String userId){
        return purchaseRepository.getByUser(userId);
    }

    public Purchase save (Purchase purchase){
        return purchaseRepository.save(purchase);
    }








}
