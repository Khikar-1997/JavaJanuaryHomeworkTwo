package com.company.rose.petal_and_bud;

import java.util.Objects;

public class Bud extends RoseQuantity {
    //region Propertys

    private String fragrance;
    private int budDiameter;

    //endregion

    //region Constructors

    public Bud(int roseQuantity, String fragrance, int budDiameter) {
        super(roseQuantity);
        this.fragrance = fragrance;
        this.budDiameter = budDiameter;
    }

    public Bud(int roseQuantity, int budDiameter) {
        super(roseQuantity);
        this.budDiameter = budDiameter;
    }

    public Bud() {
    }

    //endregion

    //region Public Methods

    //endregion

    //region Getter and Setter

    public String getFragrance() {
        return fragrance;
    }

    public void setFragrance(String fragrance) {
        this.fragrance = fragrance;
    }

    public int getBudDiameter() {
        return budDiameter;
    }

    public void setBudDiameter(int budDiameter) {
        this.budDiameter = budDiameter;
    }

    //endregion

    //region equals,hashCode and toString Public Methods

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bud bud = (Bud) o;
        return budDiameter == bud.budDiameter &&
                Objects.equals(fragrance, bud.fragrance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fragrance, budDiameter);
    }

    @Override
    public String toString() {
        return "Bud{" +
                "color='" + fragrance + '\'' +
                ", budDiameter=" + budDiameter +
                '}';
    }

    //endregion
}
