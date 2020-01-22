package com.company.dog.puppy;

import com.company.dog.Dog;

import java.util.Objects;

public class Puppy extends Dog {
    //region Proprtys

    private int quantityOfPuppies;

    //endregion

    //region Constructors

    public Puppy(double age, String name, String breed, String barkOfDogs) {
        super(age, name, breed, barkOfDogs);
    }

    public Puppy() {
    }

    //endregion

    //region Getter and Setter

    public int getQuantityOfPuppies() {
        return quantityOfPuppies;
    }

    public void setQuantityOfPuppies(int quantityOfPuppies) {
        this.quantityOfPuppies = quantityOfPuppies;
    }

    //endregion

    //region equals,hashCode and toString Public Methods

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Puppy puppy = (Puppy) o;
        return quantityOfPuppies == puppy.quantityOfPuppies;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), quantityOfPuppies);
    }

    @Override
    public String toString() {
        return "Puppy{" +
                "quantityOfPuppies=" + quantityOfPuppies +
                '}';
    }

    //endregion
}
