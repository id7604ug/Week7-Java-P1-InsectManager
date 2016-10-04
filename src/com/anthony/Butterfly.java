package com.anthony;


public class Butterfly extends Insect{
    // Create variables
    private String wingColor;
    private String favoriteFlower;
    // Constructor
    public Butterfly(String name, String wingColor, int numberOFWings, String favoriteFlower) {
        // Set superclass variables
        super(name, numberOFWings);
        // Set local variables
        this.wingColor = wingColor;
        this.favoriteFlower = favoriteFlower;
    }
    public void printSpeciesData(){
        System.out.println("Name: " + this.getName() + "\nWing Color: " + this.wingColor + "\nNumber of Wings: "
                + this.getNumberOfWings() + "\nNumber of legs: " + this.getNumberOfLegs()
                + "\nFavorite Flower: " + this.favoriteFlower);
    }

    public String getWingColor() {
        return wingColor;
    }

    public void setWingColor(String wingColor) {
        this.wingColor = wingColor;
    }

    public String getFavoriteFlower() {
        return favoriteFlower;
    }

    public void setFavoriteFlower(String favoriteFlower) {
        this.favoriteFlower = favoriteFlower;
    }
}
