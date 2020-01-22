package com.company;

import com.company.tree.Leaf;
import com.company.tree.Tree;

public class Main {

    public static void main(String[] args) {
        Leaf leaf = new Leaf("yellow", 5);
        Tree tree = new Tree("white", leaf);
        tree.bloom();
        tree.makeLeafsYellow();
        tree.makeLeafsFall();
    }
}
