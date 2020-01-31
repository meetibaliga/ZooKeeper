package oop.proj.animalfamily;

import oop.proj.animal.*;

public abstract class Feline extends Animal{
	
	public Feline(String s) {
		super(s);
	}
	
	public String roam() {
		return "roaming like a Feline";
	}
	
	public String eat() {
		return "eating like a Feline";
	}
	
	final String family = "Feline";
	@Override
	public String getFamily() {
		return "  " + family ;
	}

}
