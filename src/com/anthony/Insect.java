package com.anthony;

public abstract class Insect {
    // Create variables
    private String name;
    private int numberOfWings;
    private static int numberOfLegs = 6;

    // Constructor
    public Insect(String name, int numWings){
        this.name = name;
        this.numberOfWings = numWings;
    }
    // Getters and setters
    public String getName() {
        return name;
    }
    public int getNumberOfWings() {
        return numberOfWings;
    }
    public void setNumberOfWings(int numberOfWings) {
        this.numberOfWings = numberOfWings;
    }
    public static int getNumberOfLegs() {
        return numberOfLegs;
    }

    // Abstract method
    public abstract void printSpeciesData();
}