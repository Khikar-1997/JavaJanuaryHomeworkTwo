package com.company.house.houseClases;

import java.util.Objects;

public abstract class HouseStructure {
    //region Propertys
    private int quantity;
    //endregion

    //region Constructors

    public HouseStructure(int quantity) {
        this.quantity = quantity;
    }

    public HouseStructure() {
    }

    //endregion

    //region Getter and Setter

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        } else throw new RuntimeException("The house have not doors or windows");
    }

    //endregion

    //region equals,hashCode and toString Public Methods

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HouseStructure that = (HouseStructure) o;
        return quantity == that.quantity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(quantity);
    }

    @Override
    public String toString() {
        return "HouseStructure{" +
                "quantity=" + quantity +
                '}';
    }

    //endregion
}

