package com.api.rest.web.controller;

import com.api.rest.domain.Purchase;
import com.api.rest.domain.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/buy")
public class PurchaseController {


    @Autowired
    private PurchaseService purchaseService;


    /*
    Metodo para obtener todas las compras
     */
    @GetMapping("/all")
    public ResponseEntity<List<Purchase>> getAll() {
        return new ResponseEntity<>(purchaseService.getAll(), HttpStatus.OK);
    }

    /*
       Metodo para obtener las compras por usuario

    */

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Purchase>> getPurchase(@PathVariable("userId") String userId) {
        return purchaseService.getByUser(userId).
                map(purchases -> new ResponseEntity<>(purchases, HttpStatus.OK)).
                orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }


    /*
          Metodo para realizar una compra

    */
    @PostMapping ("/save")
    public ResponseEntity <Purchase> save (@RequestBody Purchase purchase){
        return new ResponseEntity<>(purchaseService.save(purchase),HttpStatus.CREATED);


    }
}