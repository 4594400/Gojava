package com.goit.module_6.musicShopOrder;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MusicStore {
    private List<MusicalInstrument> instruments;

    public List<MusicalInstrument> getInstruments() {
        return instruments;
    }

    public void setInstruments(List<MusicalInstrument> instruments) {
        this.instruments = instruments;
    }

    @Override
    public String toString() {
        return "MusicStore{" +
                "instruments=" + instruments +
                '}';
    }


}


/*  Добавить в магазин инструментов метод, который готовит к отгрузке партию музыкальных инструментов согласно заказу.

    Сигнатура метода:
    public List<Instrument> prepareInstruments(Map<String, Integer> order){...}

    В заказе (Map<String, Integer> order) хранится название инструмента и количество необходимых инструментов.

        Ключем в заказе является одна из строк "piano", "guitar", "trumpets"

        Создать свое исключение, которое будет брошено в случае, когда ключ в заказе другой.

        Каким-то образом (самостоятельно выбрать решение) обработать ситуацию, когда количество элементов в заказе отрицательное, нулевое.

        После выполнения метода из магазина должны пропасть те инструменты, которые были отгружены.
        В случае, когда количество запрашиваемых инструментов определенного типа больше, чем количество доступных инструментов в магазине,
        должно быть брошено исключение. Выбрать наиболее подходящее из доступных в стандартной библиотеке исключений
*/