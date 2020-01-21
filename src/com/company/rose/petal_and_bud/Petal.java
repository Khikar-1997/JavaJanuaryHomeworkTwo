package com.company.rose.petal_and_bud;

import java.util.Objects;

public class Petal extends RoseQuantity {
    //region Propertys

    private String color;
    private double petalSize;

    //endregion

    //region Constructors

    public Petal(int quantity, int roseQuantity, String color, double petalSize) {
        super(quantity, roseQuantity);
        this.color = color;
        this.petalSize = petalSize;
    }

    public Petal() {
    }

    //endregion

    //region Public Methods

    //endregion

    //region Getter and Setter

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPetalSize() {
        return petalSize;
    }

    public void setPetalSize(double petalSize) {
        this.petalSize = petalSize;
    }

    //endregion

    //region equals,hashCode and toString Public Methods

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Petal petal = (Petal) o;
        return Double.compare(petal.petalSize, petalSize) == 0 &&
                Objects.equals(color, petal.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, petalSize);
    }

    @Override
    public String toString() {
        return "Petal{" +
                "color='" + color + '\'' +
                ", petalSize=" + petalSize +
                '}';
    }

    //endregion
}
