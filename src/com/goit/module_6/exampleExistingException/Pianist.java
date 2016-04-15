package com.goit.module_6.exampleExistingException;


public class Pianist implements Sounding{

    @Override
    public void play(MusicalInstrument musicalInstrument) throws IllegalArgumentException{
        if (musicalInstrument instanceof Piano) {
            System.out.println("Started playing the " + musicalInstrument.getName());
    } else {
            throw new IllegalArgumentException(" " + musicalInstrument.getType());
        }
}
}
