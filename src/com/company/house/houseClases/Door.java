package com.company.house.houseClases;

import java.util.Objects;

public class Door extends HouseStructure {
    //region Propertys
    private String colorOfDoor;
    private double heigth;
    private double width;
    //endregion

    //region Constructors

    public Door(int quantity, String colorOfDoor, double heigth, double width) {
        super(quantity);
        this.colorOfDoor = colorOfDoor;
        this.heigth = heigth;
        this.width = width;
    }

    public Door(String colorOfDoor, double heigth, double width) {
        this.colorOfDoor = colorOfDoor;
        this.heigth = heigth;
        this.width = width;
    }

    public Door(int quantity) {
        super(quantity);
    }

    public Door() {
    }
    //endregion

    //region Getter and Setter
    public String getColorOfDoor() {
        return colorOfDoor;
    }

    public void setColorOfDoor(String colorOfDoor) {
        this.colorOfDoor = colorOfDoor;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    //endregion

    //region equals,hashCode and toString Public Methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Door door = (Door) o;
        return Double.compare(door.heigth, heigth) == 0 &&
                Double.compare(door.width, width) == 0 &&
                Objects.equals(colorOfDoor, door.colorOfDoor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), colorOfDoor, heigth, width);
    }

    @Override
    public String toString() {
        return "Door{" +
                "colorOfDoor='" + colorOfDoor + '\'' +
                ", heigth=" + heigth +
                ", width=" + width +
                '}';
    }
    //endregion
}

