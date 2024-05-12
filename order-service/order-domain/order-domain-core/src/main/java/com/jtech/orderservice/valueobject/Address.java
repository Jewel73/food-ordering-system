package com.jtech.orderservice.valueobject;

import com.jtech.base.entity.BaseEntity;

import java.util.Objects;
import java.util.UUID;

public class Address extends BaseEntity<UUID> {
    private final String city;
    private final String street;
    private final Integer postCode;

    public Address(UUID uuid,String city, String street, Integer postCode) {
        super(uuid);
        this.city = city;
        this.street = street;
        this.postCode = postCode;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public Integer getPostCode() {
        return postCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Address address = (Address) o;
        return Objects.equals(city, address.city) && Objects.equals(street, address.street) && Objects.equals(postCode, address.postCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), city, street, postCode);
    }
}
