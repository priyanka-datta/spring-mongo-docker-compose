package com.priyanka.datta.springmongodockercompose.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Document(collection = "CART")
public class Cart {

    @Id
    @Field(name = "ID")
    private String id;

    @Field(name = "ITEM")
    private String item;

    @Field(name = "PRICE")
    private Double price;

    @Field(name = "QTY")
    private Integer qty;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }
}
