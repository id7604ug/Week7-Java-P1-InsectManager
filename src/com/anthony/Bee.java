package com.anthony;

public class Bee extends Insect{
    // Create variables
    private String color;
    private boolean makesHoney;
    private String favoriteFlower;

    // Constructor
    public Bee(String name, String color, int numberOfWings, String favoriteFlower, boolean makesHoney){
        super(name, numberOfWings);
        this.color = color;
        this.favoriteFlower = favoriteFlower;
        this.makesHoney = makesHoney;
    }

    // Method to return the species data
    public void printSpeciesData(){
        System.out.println("Name: " + this.getName() + "\nNumber of Wings: " + this.getNumberOfWings()
                + "\nNumber of Legs: " + this.getNumberOfLegs() + "\nFavorite Flower: " + this.favoriteFlower
                + "\nMakes Honey? " + makesHoney);
    }
    // Getters and Setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isMakesHoney() {
        return makesHoney;
    }

    public void setMakesHoney(boolean makesHoney) {
        this.makesHoney = makesHoney;
    }

    public String getFavoriteFlower() {
        return favoriteFlower;
    }

    public void setFavoriteFlower(String favoriteFlower) {
        this.favoriteFlower = favoriteFlower;
    }
}
