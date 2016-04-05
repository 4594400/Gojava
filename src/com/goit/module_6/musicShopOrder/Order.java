package com.goit.module_6.musicShopOrder;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Order {

        public List<MusicalInstrument> checkAvailabillityOfGoodsInStock (MusicStore store, Map<String, Integer> order) {
        List <MusicalInstrument> result = new ArrayList<>();
        for (Map.Entry<String, Integer> orderEntry: order.entrySet()) {
            String orderInstrumentType = orderEntry.getKey();
            Integer instrumentQuantity = orderEntry.getValue();
            if (instrumentQuantity<0){
                throw new IllegalArgumentException("MISTAKE! | The amount ordered instruments can not be negative!");
            } else if (instrumentQuantity==0) {
                System.out.println("You forgot to order " + orderInstrumentType + "!");
            }

            System.out.println("Ordered " + orderInstrumentType + " = " + instrumentQuantity);

            int quantityInStock=0;
            for (MusicalInstrument instrument: store.getInstruments()) {
                if (instrument.getType().equals(orderInstrumentType) && quantityInStock < instrumentQuantity) {
                    result.add(instrument);
                    quantityInStock++;
                }
            }
            if (quantityInStock < instrumentQuantity)
                throw new IllegalArgumentException("Not available an amount " + orderInstrumentType);
        }
        return result;
    }

    public void removeIntstrumentFromTheStoreAccordingToTheOrder(MusicStore store, Map<String, Integer> order){
        for (Map.Entry<String, Integer> orderEntry: order.entrySet()) {
            String orderInstrumentType = orderEntry.getKey();
            Integer numberInstrumentInOrder = orderEntry.getValue();
            int numberInstrumentToRemove = 0;
            Iterator<MusicalInstrument> musicalInstrumentIterator = store.getInstruments().iterator();
            while (musicalInstrumentIterator.hasNext()){
                MusicalInstrument musicalInstrument = musicalInstrumentIterator.next();
                if (musicalInstrument.getType().equals(orderInstrumentType) && numberInstrumentToRemove<numberInstrumentInOrder){
                 musicalInstrumentIterator.remove();
                    numberInstrumentToRemove++;
                }
            }
        }
    }

}
