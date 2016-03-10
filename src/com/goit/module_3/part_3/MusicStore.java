package com.goit.module_3.part_3;


import java.util.List;

public class MusicStore {

	private List<Piano> piano;
	private List<Guitar> guitar;
	private List<Trumpet> trumpet;
	
	public List<Piano> getPiano() {
	 	 return piano; 
	}
	
	public void setPiano(List<Piano> piano) { 
		 this.piano = piano; 
	}
	
	public List<Guitar> getGuitar() {
	 	 return guitar; 
	}
	
	public void setGuitar(List<Guitar> guitar) { 
		 this.guitar = guitar; 
	}
	
	public List<Trumpet> getTrumpet() {
	 	 return trumpet; 
	}
	
	public void setTrumpet(List<Trumpet> trumpet) { 
		 this.trumpet = trumpet; 
	} 

}