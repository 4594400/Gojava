package com.goit.module_8;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        MusicStore musicStore = new MusicStore();
        List<MusicalInstrument> musicalInstruments = createListOfInstruments();
        musicStore.setInstruments(musicalInstruments);

/* -------------------------------------Sorting instruments by brand and price. Print as table----------------------------------------------------------*/
        Set<MusicalInstrument> sortedInstruments = new TreeSet<>(new ComparatorByBrand().thenComparing(new ComparatorByPrice()));
        sortedInstruments.addAll(musicStore.getInstruments());
        System.out.printf("%-15s%10s%10s%n", "Brand", "Weight", "Price");
        System.out.printf("%35s%n", "-----------------------------------");
        for (MusicalInstrument instrument: sortedInstruments) {
            System.out.printf("%-15s%10d%10d%n",instrument.getBrand(), instrument.getWeight(), instrument.getPrice());
        }
        System.out.printf("%35s%n", "-----------------------------------");
    }

    public static List<MusicalInstrument> createListOfInstruments() {
        List<MusicalInstrument> musicalInstruments = new ArrayList<>();

        musicalInstruments.add(new Guitar("Rickenbacker", 2, 1000));
        musicalInstruments.add(new Guitar("Ruokangas", 3, 1500));
        musicalInstruments.add(new Guitar("Sadowsky", 5, 400));

        musicalInstruments.add(new Piano("Aldrich", 60, 5000));
        musicalInstruments.add(new Piano("Ashenback", 80, 10000));
        musicalInstruments.add(new Piano("Byelloruss", 1000, 30000));

        musicalInstruments.add(new Trumpet("Kanstul", 12, 150));
        musicalInstruments.add(new Trumpet("Rossetti", 18, 850));
        musicalInstruments.add(new Trumpet("Carol", 8, 300));
        return musicalInstruments;
    }
}

