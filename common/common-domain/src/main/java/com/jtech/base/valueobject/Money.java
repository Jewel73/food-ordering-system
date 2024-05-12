package com.jtech.base.valueobject;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class Money {
    private final BigDecimal amount;


    public Money(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public boolean isGreaterThanZero(Money amount){
        return amount.getAmount().compareTo(BigDecimal.ZERO) > 0;
    }

    public Money add(Money amount){
        return new Money(setScale(amount.getAmount().add(this.getAmount())));
    }

    public Money subtract(Money amount){
        return new Money(setScale(amount.getAmount().subtract(this.getAmount())));
    }

    public Money multiply(Money amount){
        return new Money(setScale(amount.getAmount().multiply(this.getAmount())));
    }

    private BigDecimal setScale(BigDecimal amount){
        return amount.setScale(2, RoundingMode.HALF_EVEN);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return Objects.equals(amount, money.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}
