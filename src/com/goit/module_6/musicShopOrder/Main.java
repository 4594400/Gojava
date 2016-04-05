package com.goit.module_6.musicShopOrder;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
/************************** fill the store *********************************/
        MusicStore store = new MusicStore();

        List<MusicalInstrument> instruments = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            instruments.add(new Guitar());
        }
        for (int i = 0; i < 10; i++) {
            instruments.add(new Piano());
        }
        for (int i = 0; i < 15; i++) {
            instruments.add(new Trumpet());
        }
        store.setInstruments(instruments);

        System.out.println("Number of music instruments in store = " + store.getInstruments().size());

/**************************create an order*********************************/
        Map<String, Integer> order = new HashMap<>();
        order.put("Guitar", 15);
        order.put("Piano", 0);
        order.put("Trumpet", -12);

        Order customerOrder = new Order();
        try{
        customerOrder.checkAvailabillityOfGoodsInStock(store, order);
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        customerOrder.removeIntstrumentFromTheStoreAccordingToTheOrder(store, order);
        System.out.println("Number of music instruments in store = " + store.getInstruments().size());



    }






}
