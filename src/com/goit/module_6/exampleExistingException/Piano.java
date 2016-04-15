package com.goit.module_6.exampleExistingException;


public class Piano extends MusicalInstrument {

    @Override
    public String getType() {
        return "Piano";
    }

    public Piano(String name) {
        super(name);
    }
}