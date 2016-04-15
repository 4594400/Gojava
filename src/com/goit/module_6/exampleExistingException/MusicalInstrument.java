package com.goit.module_6.exampleExistingException;


public abstract class MusicalInstrument {
    private String name;
    public abstract String getType();

    public MusicalInstrument(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}