package com.company.tree;

import java.util.Objects;

public class Leaf {
    //region Propertys

    private String color;
    private int leafSize;

    //endregion

    //region Constructors

    public Leaf(String color, int leafSize) {
        this.color = color;
        this.leafSize = leafSize;
    }

    public Leaf() {
    }
    //endregion

    //region Getter and Setter

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLeafSize() {
        return leafSize;
    }

    public void setLeafSize(int leafSize) {
        this.leafSize = leafSize;
    }

    //endregion

    //region equals,hashCode and toString Public Methods

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Leaf leaf = (Leaf) o;
        return leafSize == leaf.leafSize &&
                Objects.equals(color, leaf.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, leafSize);
    }

    @Override
    public String toString() {
        return "Leaf{" +
                "color='" + color + '\'' +
                ", leafSize=" + leafSize +
                '}';
    }

    //endregion
}
