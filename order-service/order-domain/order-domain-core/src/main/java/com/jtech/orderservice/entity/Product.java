package com.jtech.orderservice.entity;

import com.jtech.base.entity.BaseEntity;
import com.jtech.base.valueobject.Money;
import com.jtech.base.valueobject.ProductId;

public class Product extends BaseEntity<ProductId> {
    private String name;
    private Money price;

    public Product(ProductId productId, String name, Money price) {
        super(productId);
        this.name = name;
        this.price = price;
    }

    public Product(String name, Money price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Money getPrice() {
        return price;
    }
}
