package com.goit.module_8;


import java.util.Comparator;

public class ComparatorByBrand implements Comparator<MusicalInstrument>{

    @Override
    public int compare(MusicalInstrument i1, MusicalInstrument i2) {
        return i1.getBrand().toLowerCase().compareTo(i2.getBrand().toLowerCase());
    }
}
