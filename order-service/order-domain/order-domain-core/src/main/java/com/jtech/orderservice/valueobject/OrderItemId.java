package com.jtech.orderservice.valueobject;

import com.jtech.base.valueobject.BaseId;

public class OrderItemId extends BaseId<Long> {
    protected OrderItemId(Long id) {
        super(id);
    }
}
