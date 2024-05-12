package com.jtech.base.valueobject;

import java.util.UUID;

public class ProductId extends BaseId<UUID>{
    protected ProductId(UUID id) {
        super(id);
    }
}
