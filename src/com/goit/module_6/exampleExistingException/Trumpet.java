package com.goit.module_6.exampleExistingException;


public class Trumpet extends MusicalInstrument {

    @Override
    public String getType() {
        return "Trumpet";
    }

    public Trumpet(String name) {
        super(name);
    }
}