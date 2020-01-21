package com.company.rose;

import com.company.rose.petal_and_bud.Bud;
import com.company.rose.petal_and_bud.Petal;

import java.util.ArrayList;
import java.util.Objects;

public class Rose implements Printable, BloomAnddWiltRose {
    //region Propertys

    private ArrayList<Bud> buds;
    private ArrayList<Petal> petals;

    //endregion

    //region Constructors

    public Rose(ArrayList<Bud> bud, ArrayList<Petal> petals) {
        this.buds = bud;
        this.petals = petals;
    }

    public Rose() {
    }
    //endregion

    //region Public Methods

    @Override
    public void bloom() {
        buds = new ArrayList<>();
        Bud budOne = new Bud(3, " sweet ", 4);
        Bud budTwo = new Bud(4, " odorless ", 6);
        Bud budThree = new Bud(1, " sweet ", 7);
        buds.add(budOne);
        buds.add(budTwo);
        buds.add(budThree);
        for (Bud bud : buds) {
            System.out.println("We have " + bud.getRoseQuantity() + " bloomed roses, they have a" + bud.getFragrance() + "odor,and their bud size is " + bud.getBudDiameter() + " cm^2.");
        }
        System.out.println();
    }

    @Override
    public void wilt() {
        buds = new ArrayList<>();
        Bud budOne = new Bud(3, 4);
        Bud budTwo = new Bud(4, 6);
        Bud budThree = new Bud(1, 7);
        buds.add(budOne);
        buds.add(budTwo);
        buds.add(budThree);
        for (Bud bud : buds) {
            System.out.println("We have " + bud.getRoseQuantity() + " wilted roses,and their bud size is " + bud.getBudDiameter() + " cm^2.");
        }
        System.out.println();
    }

    @Override
    public void printQuantityOfPetals() {
        petals = new ArrayList<>();
        Petal petalsOfFirstBouquet = new Petal(30, 3, " red ", 2.5);
        Petal petalsOfSecondBouquet = new Petal(50, 5, " white ", 2.5);
        Petal petalsOfThiredBouquet = new Petal(70, 7, " yellow ", 2.5);
        petals.add(petalsOfFirstBouquet);
        petals.add(petalsOfSecondBouquet);
        petals.add(petalsOfThiredBouquet);

        for (int i = 0; i < petals.size(); i++) {
            System.out.println("The bouquet have " + petals.get(i).getRoseQuantity() + " roses,bouquet of" + petals.get(i).getColor() + "roses have " + petals.get(i).getQuantity() + " petals,and the petals size is " + petals.get(i).getPetalSize() + " cm^2.");
        }
    }
    //endregion

    //region Getter and Setter

    public ArrayList<Bud> getBud() {
        return buds;
    }

    public void setBud(ArrayList<Bud> bud) {
        this.buds = bud;
    }

    public ArrayList<Petal> getPetals() {
        return petals;
    }

    public void setPetals(ArrayList<Petal> petals) {
        this.petals = petals;
    }

    //endregion

    //region equals,hashCode and toString Public Methods

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rose rose = (Rose) o;
        return Objects.equals(buds, rose.buds) &&
                Objects.equals(petals, rose.petals);
    }

    @Override
    public int hashCode() {
        return Objects.hash(buds, petals);
    }

    @Override
    public String toString() {
        return "Rose{" +
                "bud=" + buds +
                ", petal=" + petals +
                '}';
    }

    //endregion
}
