package com.priyanka.datta.springmongodockercompose.repository;

import com.priyanka.datta.springmongodockercompose.entity.Cart;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends MongoRepository<Cart,String> {
}
