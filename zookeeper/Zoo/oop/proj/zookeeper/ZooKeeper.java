package oop.proj.zookeeper;

import java.util.List;

import oop.proj.animal.*;
import oop.proj.zooanimals.*;


public class ZooKeeper {
	
	// wake up the animals 
	public static void wakeup_animal(List<Animal> animal_list) {
		for (Animal a : animal_list) {
			if (a instanceof Cat) {
				System.out.println(a.getName() + " who is a " + a.getType() + " belonging to" + a.getFamily() + " is "+ a.eat());
			}
			else {
				System.out.println(a.getName() + " who is a " + a.getType() + " belonging to" + a.getFamily() + " is "+ a.wakeup());
			}
			
		}
	}
	
	public static void rollcall_animal(List<Animal> animal_list) {
		for (Animal a : animal_list) {
			if (a instanceof Cat) {
				System.out.println(a.getName() + " who is a " + a.getType() + " belonging to" + a.getFamily() + " is "+ a.eat());
			}
			else {
				System.out.println(a.getName() + " who is a " + a.getType() + " belonging to" + a.getFamily() + " is "+  a.makeNoise());
			}
		}
	}
	
	public static void feed_animal(List<Animal> animal_list) {
		for (Animal a : animal_list) {
			if (a instanceof Cat) {
				System.out.println(a.getName() + " who is a " + a.getType() + " belonging to" + a.getFamily() + " is "+ a.eat());
			}
			else {
				System.out.println(a.getName() + " who is a " + a.getType() + " belonging to" + a.getFamily() + " is "+ a.eat());
			}
		}
	}
	
	public static void exercise_animal(List<Animal> animal_list) {
		for (Animal a : animal_list) {
			if (a instanceof Cat) {
				System.out.println(a.getName() + " who is a " + a.getType() + " belonging to" + a.getFamily() + " is "+ a.eat());
			}
			else {
				System.out.println(a.getName() + " who is a " + a.getType() + " belonging to" + a.getFamily() + " is "+ a.roam());
			}
		}
	}
	
	public static void shutdown(List<Animal> animal_list) {
		for (Animal a : animal_list) {
			if (a instanceof Cat) {
				System.out.println(a.getName() + " who is a " + a.getType() + "belonging to" + a.getFamily() + " is "+ a.eat());
			}
			else {
				System.out.println(a.getName() + " who is a " + a.getType() + " belonging to" + a.getFamily() + " is "+ a.sleep());
			}
		}
	}

}
