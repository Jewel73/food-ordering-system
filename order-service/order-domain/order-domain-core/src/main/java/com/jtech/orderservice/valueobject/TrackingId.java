package com.jtech.orderservice.valueobject;

import com.jtech.base.valueobject.BaseId;

import java.util.UUID;

public class TrackingId extends BaseId<UUID> {
    protected TrackingId(UUID id) {
        super(id);
    }
}
