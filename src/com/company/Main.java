package com.company;

import com.company.dog.Dog;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog(4.5, "Reks", "Tibetien Mastif", "GAF-GAF");

        dog.printName();
        dog.bark();
        dog.giveBirthToOffspring();
    }
}
