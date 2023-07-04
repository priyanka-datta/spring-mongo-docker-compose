package com.priyanka.datta.springmongodockercompose.controller;

import com.priyanka.datta.springmongodockercompose.entity.Cart;
import com.priyanka.datta.springmongodockercompose.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CartController {

    @Autowired
    private CartRepository cartRepository;

    @RequestMapping(value = "/cart", method = RequestMethod.POST)
    public ResponseEntity<Object> add(@RequestBody Cart cart){
        return new ResponseEntity<>(cartRepository.save(cart), HttpStatus.CREATED);
    }

    @RequestMapping(value = "/cart", method = RequestMethod.GET)
    public ResponseEntity<Object> get(){
        return new ResponseEntity<>(cartRepository.findAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "/cart/{id}", method = RequestMethod.GET)
    public ResponseEntity<Object> getById(@PathVariable String id){
        return new ResponseEntity<>(cartRepository.findById(id), HttpStatus.OK);
    }
}
