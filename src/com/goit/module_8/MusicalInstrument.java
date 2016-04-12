package com.goit.module_8;


public abstract class MusicalInstrument {

    private String brand;
    private int weight;
    private int price;

    public MusicalInstrument(String brand, int weight, int price) {
        this.brand = brand;
        this.weight = weight;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}