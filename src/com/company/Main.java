package com.company;

import com.company.house.Door;
import com.company.house.OpenOrCloseHouseDoor;
import com.company.house.Window;

public class Main {

    public static void main(String[] args) {
        OpenOrCloseHouseDoor houseDoor = new OpenOrCloseHouseDoor() {
            @Override
            public void lockTheHouseByKey() {
                System.out.println("The house door is open by key.");
            }
        };
        houseDoor.lockTheHouseByKey();
        Window window = new Window((short) 5);
        Door door = new Door(4);
        window.printQuantityOfWindows();
        door.printQuantityOfDoors();
    }
}
