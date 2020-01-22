package com.company.dog;

import com.company.Animal;
import com.company.dog.puppy.Puppy;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

public class Dog extends Animal implements Printable, GiveBirth, NoiseOfDogs {
    //region Propertys

    private String breed;
    private String barkOfDogs;
    private ArrayList<Puppy> puppies;

    //endregion

    //region Constructors


    public Dog(double age, String name, String breed, String barkOfDogs, ArrayList<Puppy> puppies) {
        super(age, name);
        this.breed = breed;
        this.barkOfDogs = barkOfDogs;
        this.puppies = puppies;
    }

    public Dog(double age, String name, String breed, String barkOfDogs) {
        super(age, name);
        this.breed = breed;
        this.barkOfDogs = barkOfDogs;
    }

    public Dog(String breed, ArrayList<Puppy> puppies) {
        this.breed = breed;
        this.puppies = puppies;
    }

    public Dog() {
    }

    //endregion

    //region Public Methods

    @Override
    public void giveBirthToOffspring() {
        puppies = new ArrayList<>();
        Random random = new Random();
        Puppy puppy = new Puppy();
        puppy.setQuantityOfPuppies(random.nextInt(5) + 1);
        Puppy puppy1 = new Puppy(0.001, "Reks", "Chau-Chau", "Mi-mi-mi");
        Puppy puppy2 = new Puppy(0.001, "Alex", "Chau-Chau", "Mi-mi-mi");
        Puppy puppy3 = new Puppy(0.001, "Gorge", "Chau-Chau", "Mi-mi-mi");
        Puppy puppy4 = new Puppy(0.001, "Jeco", "Chau-Chau", "Mi-mi-mi");
        Puppy puppy5 = new Puppy(0.001, "Jery", "Chau-Chau", "Mi-mi-mi");
        Puppy puppy6 = new Puppy(0.001, "Chau", "Chau-Chau", "Mi-mi-mi");
        puppies.add(puppy1);
        puppies.add(puppy2);
        puppies.add(puppy3);
        puppies.add(puppy4);
        puppies.add(puppy5);
        puppies.add(puppy6);

        for (int i = 0; i < puppy.getQuantityOfPuppies(); i++) {
            System.out.println("The puppies age is " + puppies.get(i).getAge() + ",name is " + puppies.get(i).getName() + ".His breed is " + puppies.get(i).getBreed() + ".The puppies bark is " + puppies.get(i).getBarkOfDogs() + ".");
        }

        System.out.println("The born puppies quantity is " + puppy.getQuantityOfPuppies() + ".");

    }

    @Override
    public void bark() {
        System.out.println("The dogs bark " + getBarkOfDogs() + ".");
    }

    @Override
    public void printName() {
        System.out.println("The dogs name is " + getName() + ".");
    }

    //endregion

    //region Getter and Setter

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public ArrayList<Puppy> getPuppies() {
        return puppies;
    }

    public void setPuppies(ArrayList<Puppy> puppies) {
        this.puppies = puppies;
    }

    public String getBarkOfDogs() {
        return barkOfDogs;
    }

    public void setBarkOfDogs(String barkOfDogs) {
        this.barkOfDogs = barkOfDogs;
    }

    //endregion

    //region equals,hashCode and toString Public Methods

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return Objects.equals(breed, dog.breed) &&
                Objects.equals(barkOfDogs, dog.barkOfDogs) &&
                Objects.equals(puppies, dog.puppies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), breed, barkOfDogs, puppies);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", barkOfDogs='" + barkOfDogs + '\'' +
                ", puppies=" + puppies +
                '}';
    }

    //endregion
}
