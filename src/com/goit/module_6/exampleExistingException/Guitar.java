package com.goit.module_6.exampleExistingException;


public class Guitar extends MusicalInstrument {

    @Override
    public String getType() {
        return "Guitar";
    }

    public Guitar(String name) {
        super(name);
    }
}