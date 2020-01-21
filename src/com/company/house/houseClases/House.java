package com.company.house.houseClases;

import com.company.houseInterfaces.OpenOrCloseHouseDoor;
import com.company.houseInterfaces.Printable;

import java.util.Objects;

public class House implements Printable, OpenOrCloseHouseDoor {
    //region Propertys
    private Door door;
    private Window window;
    private boolean key;
    //endregion

    //region Constructors

    public House(Door door, Window window, boolean key) {
        this.door = door;
        this.window = window;
        this.key = key;
    }

    public House() {
    }
    //endregion

    //region Public Methods

    @Override
    public void lockTheHouseByKey() {
        if (this.key) {
            System.out.println("The house door is open.");
        } else {
            System.out.println("This is not the house key.");
        }
    }

    @Override
    public void printQuantityOfDoors() {
        System.out.println("The house have " + door.getQuantity() + " doors.");
    }

    @Override
    public void printQuantityOfWindows() {
        System.out.println("The house have " + window.getQuantity() + " windows.");
    }
    //endregion

    //region Getter and Setter

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    public Window getWindow() {
        return window;
    }

    public void setWindow(Window window) {
        this.window = window;
    }

    public boolean isKey() {
        return key;
    }

    public void setKey(boolean key) {
        this.key = key;
    }

    //endregion

    //region equals,hashCode and toString Public Methods

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return key == house.key &&
                Objects.equals(door, house.door) &&
                Objects.equals(window, house.window);
    }

    @Override
    public int hashCode() {
        return Objects.hash(door, window, key);
    }

    @Override
    public String toString() {
        return "House{" +
                "door=" + door +
                ", window=" + window +
                ", key=" + key +
                '}';
    }

    //endregion
}

