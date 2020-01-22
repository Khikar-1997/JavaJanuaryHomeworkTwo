package com.company.tree;

import java.util.Objects;

public class Tree implements TreeInSpringAndAutumn {
    //region Propertys

    private String colorOfTreesFlower;
    private Leaf leaf;

    //endregion

    //region Constructors


    public Tree(String colorOfTreesFlower, Leaf leaf) {
        this.colorOfTreesFlower = colorOfTreesFlower;
        this.leaf = leaf;
    }

    public Tree() {
    }

    //endregion

    //region Public Methods

    @Override
    public void bloom() {
        System.out.println("The trees in the spring are bloomed,and their flowers color is " + this.colorOfTreesFlower + ".");
    }

    @Override
    public void makeLeafsYellow() {
        System.out.println("In autumn the trees leaves change their color and become " + leaf.getColor() + ".");
    }

    @Override
    public void makeLeafsFall() {
        System.out.println("And leaves are fall in the last of autumn.");
    }
    //endregion

    //region Getter and Setter

    public String getColorOfTreesFlower() {
        return colorOfTreesFlower;
    }

    public void setColorOfTreesFlower(String colorOfTreesFlower) {
        this.colorOfTreesFlower = colorOfTreesFlower;
    }

    public Leaf getLeaf() {
        return leaf;
    }

    public void setLeaf(Leaf leaf) {
        this.leaf = leaf;
    }

    //endregion

    //region equals,hashCode and toString Public Methods

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tree tree = (Tree) o;
        return Objects.equals(colorOfTreesFlower, tree.colorOfTreesFlower) &&
                Objects.equals(leaf, tree.leaf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(colorOfTreesFlower, leaf);
    }

    @Override
    public String toString() {
        return "Tree{" +
                "color of trees flower ='" + colorOfTreesFlower + '\'' +
                ", leaf=" + leaf +
                '}';
    }

    //endregion
}
