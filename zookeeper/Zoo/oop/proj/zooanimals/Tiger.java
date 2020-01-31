package oop.proj.zooanimals;

import oop.proj.animalfamily.*;

/**
 * 
 *
 */
public class Tiger extends Feline {


	public Tiger(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}


	@Override
	public String makeNoise() {
		return "is making noise like a Tiger.";
		
	}

	
	final String type = "Tiger";
	@Override
	public String getType() {
		return type;
	}

}
