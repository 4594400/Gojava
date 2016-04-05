package com.goit.module_6.musicShopOrder;

public abstract class MusicalInstrument {
    public abstract String getType();

    @Override
    public String toString() {
        return "MusicalInstrument{" + getType() + "}";
    }
}
