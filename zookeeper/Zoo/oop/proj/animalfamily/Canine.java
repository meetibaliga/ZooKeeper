package oop.proj.animalfamily;

import oop.proj.animal.*;

public abstract class Canine extends Animal{
	
	public Canine(String s) {
		super(s);
	}
	
	public String wakeup() {
		return "waking like Canine";
	}
	
	public String makeNoise() {
		return "making noise like Canine";
	}
	
	final String family = "Canine";
	@Override
	public String getFamily() {
		return "  " + family;
	}

}
