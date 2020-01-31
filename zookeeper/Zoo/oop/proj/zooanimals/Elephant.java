package oop.proj.zooanimals;

import oop.proj.animalfamily.*;

/**
 * 
 *
 */
public class Elephant extends Pachyderm {


	public Elephant(String s) {
		super(s);
	}

	
	final String type = "Elephant";
	@Override
	public String getType() {
		return type;
	}


	@Override
	public String makeNoise() {
		return "is making noise like an Elephant.";
	}

}
