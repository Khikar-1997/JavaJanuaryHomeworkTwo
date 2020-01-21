package com.company;

import com.company.house.houseClases.Door;
import com.company.house.houseClases.House;
import com.company.house.houseClases.Window;

public class Main {

    public static void main(String[] args) {
        Door door = new Door(6, "Brownish", 2.4, 1.2);
        Window window = new Window(10, "Brownish", 1.5, 1.5);
        House house = new House(door, window, true);
        house.lockTheHouseByKey();
        house.printQuantityOfDoors();
        house.printQuantityOfWindows();
    }
}
