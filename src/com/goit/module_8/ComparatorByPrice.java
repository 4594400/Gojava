package com.goit.module_8;


import java.util.Comparator;

public class ComparatorByPrice implements Comparator<MusicalInstrument>{
    @Override
    public int compare(MusicalInstrument i1, MusicalInstrument i2) {
        return i1.getPrice()-i2.getPrice();
    }
}
