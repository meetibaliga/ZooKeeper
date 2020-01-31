package oop.proj.animalfamily;

import oop.proj.animal.*;

public abstract class Pachyderm extends Animal{
	
	public Pachyderm(String s) {
		super(s);
	}
	
	
	public String eat() {
		return "eating like Pachyderm";
	}
	
	final String family = "Pachyderm";
	@Override
	public String getFamily() {
		return "  " + family;
	}

}
