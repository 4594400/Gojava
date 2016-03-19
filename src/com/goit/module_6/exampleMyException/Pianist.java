package com.goit.module_6.exampleMyException;

public class Pianist implements Sounding {

    @Override
    public void play(MusicalInstrument musicalInstrument) {
        if (musicalInstrument instanceof Piano) {
            System.out.println("Started playing the " + musicalInstrument.getName());
        } else {
            throw new IllegalArgumentException("|*PROBLEM*| I'm sorry I can only play the piano. You handed me: " + musicalInstrument.getClass());
        }
    }
}
