package com.anthony;


import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.LinkedList;

public class InsectManager {
    public static void main(String[] args){
        LinkedList<Insect> insectList = new LinkedList<>();
        // Run Butterfly Method
        butterflyMethod(insectList);
        // Run Bee Method
        beeMethod(insectList);
        // Loop over LinkedList
        for (Insect i : insectList) {
            i.printSpeciesData();
            // Create new line
            System.out.println();
        }
    }

    private static void beeMethod(LinkedList<Insect> insectList) {
        // Create honeyBee object
        Bee honeyBee = new Bee("Honey Bee", "Yellow/Black", 4, "Jasmine", false);
        insectList.add(honeyBee);
//        honeyBee.printSpeciesData();
        // Create bumbleBee object
        Bee bumbleBee = new Bee("Bumble Bee", "Yellow/Black/White", 4, "Clover", false);
        insectList.add(bumbleBee);
//        bumbleBee.printSpeciesData();
        // Create cSharpBee object
        Bee cSharpBee = new Bee("C# Bee", "Black/White", 4, "Metal", false);
        insectList.add(cSharpBee);
//        cSharpBee.printSpeciesData();
    }

    private static void butterflyMethod(LinkedList<Insect> insectList) {
        // Create butterfly object
        Butterfly monarchButterfly = new Butterfly("Monarch", "Orange/Black", 4, "Milkweed");
        insectList.add(monarchButterfly);
//        monarchButterfly.printSpeciesData();
        Butterfly yellowSwallowtailButterfly = new Butterfly("Yellow Swallowtail", "Yellow/Black", 4, "Milk Parsley");
        insectList.add(yellowSwallowtailButterfly);
//        yellowSwallowtailButterfly.printSpeciesData();
        // Create another butterfly object
        Butterfly javaButterfly = new Butterfly("Java", "Yellow", 4, "Coffee");
        insectList.add(javaButterfly);
//        javaButterfly.printSpeciesData();
    }
}

