package com.company.rose.petal_and_bud;

import java.util.Objects;

public class RoseQuantity {
    //region Propertys

    private int quantity;
    private int roseQuantity;

    //endregion

    //region Constructors

    public RoseQuantity(int quantity, int roseQuantity) {
        if (roseQuantity > 0) {
            this.quantity = quantity;
            this.roseQuantity = roseQuantity;
        } else throw new RuntimeException("You have not any roses.");
    }

    public RoseQuantity(int roseQuantity) {
        if (roseQuantity > 0) {
            this.roseQuantity = roseQuantity;
        } else throw new RuntimeException("You have not any roses.");
    }

    public RoseQuantity() {
    }

    //endregion

    //region Getter and Setter

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getRoseQuantity() {
        return roseQuantity;
    }

    public void setRoseQuantity(int roseQuantity) {
        this.roseQuantity = roseQuantity;
    }
    //endregion

    //region equals,hashCode and toString Public Methods

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoseQuantity that = (RoseQuantity) o;
        return quantity == that.quantity &&
                roseQuantity == that.roseQuantity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(quantity, roseQuantity);
    }

    @Override
    public String toString() {
        return "RoseQuantity{" +
                "quantity=" + quantity +
                ", roseQuantity=" + roseQuantity +
                '}';
    }

    //endregion
}
