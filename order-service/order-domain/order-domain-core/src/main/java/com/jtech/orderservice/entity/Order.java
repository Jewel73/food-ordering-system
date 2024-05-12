package com.jtech.orderservice.entity;

import com.jtech.base.entity.AggregateRoot;
import com.jtech.base.valueobject.*;
import com.jtech.orderservice.valueobject.Address;
import com.jtech.orderservice.valueobject.TrackingId;

import java.util.List;
import java.util.UUID;

public class Order extends AggregateRoot<OrderId> {
    private final CustomerId customerId;
    private final RestaurantId restaurantId;
    private final Address address;
    private final Money price;
    private final List<OrderItem> orderItemList;


    private TrackingId trackingId;
    private OrderStatus orderStatus;
    private List<String> errorMessage;

    private Order(Builder builder) {
         super(builder.orderId);
        customerId = builder.customerId;
        restaurantId = builder.restaurantId;
        address = builder.address;
        price = builder.price;
        orderItemList = builder.orderItemList;
        trackingId = builder.trackingId;
        orderStatus = builder.orderStatus;
        errorMessage = builder.errorMessage;
    }


    public CustomerId getCustomerId() {
        return customerId;
    }

    public RestaurantId getRestaurantId() {
        return restaurantId;
    }

    public Address getAddress() {
        return address;
    }

    public Money getPrice() {
        return price;
    }

    public List<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public TrackingId getTrackingId() {
        return trackingId;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public List<String> getErrorMessage() {
        return errorMessage;
    }

    public static final class Builder {
        private OrderId orderId;
        private CustomerId customerId;
        private RestaurantId restaurantId;
        private Address address;
        private Money price;
        private List<OrderItem> orderItemList;
        private TrackingId trackingId;
        private OrderStatus orderStatus;
        private List<String> errorMessage;

        private Builder() {
        }

        public static Builder builder() {
            return new Builder();
        }

        public Builder OrderId(OrderId val) {
            orderId = val;
            return this;
        }

        public Builder customerId(CustomerId val) {
            customerId = val;
            return this;
        }

        public Builder restaurantId(RestaurantId val) {
            restaurantId = val;
            return this;
        }

        public Builder address(Address val) {
            address = val;
            return this;
        }

        public Builder price(Money val) {
            price = val;
            return this;
        }

        public Builder orderItemList(List<OrderItem> val) {
            orderItemList = val;
            return this;
        }

        public Builder trackingId(TrackingId val) {
            trackingId = val;
            return this;
        }

        public Builder orderStatus(OrderStatus val) {
            orderStatus = val;
            return this;
        }

        public Builder errorMessage(List<String> val) {
            errorMessage = val;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }
}
