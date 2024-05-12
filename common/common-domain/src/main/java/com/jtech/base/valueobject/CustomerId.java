package com.jtech.base.valueobject;

import java.util.UUID;

public class CustomerId extends BaseId<UUID> {
    protected CustomerId(UUID id) {
        super(id);
    }
}
