package com.company;

import java.util.Objects;

public abstract class Animal {
    //region Propertys

    private double age;
    private String name;

    //endregion

    //region Constructors

    public Animal(double age, String name) {
        if (age > 0 && age < 1) {
            this.age = age;
            this.name = name;

        } else {
            this.age = age;
            this.name = name;

        }
    }

    public Animal() {
    }

    //endregion

    //region Getter and Setter

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        if (age > 0 && age < 1) {
            System.out.println("It is puppy.");
            this.age = age;
        } else {
            System.out.println("It is dog.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //endregion

    //region equals,hashCode and toString Public Methods

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Double.compare(animal.age, age) == 0 &&
                Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
    //endregion

}
