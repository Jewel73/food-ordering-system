package com.jtech.base.valueobject;

import java.util.UUID;

public class RestaurantId extends BaseId<UUID> {
    protected RestaurantId(UUID id) {
        super(id);
    }
}
