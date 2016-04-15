package com.goit.module_8;


public class Trumpet extends MusicalInstrument {
    public Trumpet(String brand, int weight, int price) {
        super(brand, weight, price);
    }

    @Override
    public String getType() {
        return "Trumpet";
    }
}