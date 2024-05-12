package com.jtech.base.valueobject;

import java.util.UUID;

public class OrderId extends BaseId<UUID> {
    public OrderId(UUID uuid) {
        super(uuid);
    }
}
