package com.goit.module_8;


import java.util.ArrayList;
import java.util.List;

public class MusicStore {

	List<MusicalInstrument> instruments = new ArrayList<>();

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