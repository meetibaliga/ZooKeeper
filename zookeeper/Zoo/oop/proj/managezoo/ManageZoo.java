package oop.proj.managezoo;

import java.util.ArrayList;
import java.util.List;

import oop.proj.animal.*;
import oop.proj.zooanimals.*;
import oop.proj.zookeeper.*;

public class ManageZoo {

	public static void main(String[] args) {
		
		List<Animal> animal_list = new ArrayList<Animal>();	
	
		Cat colt = new Cat("Colt");
		Cat cam = new Cat("Cam");
		
		Tiger tim = new Tiger("Tim");
		Tiger tan = new Tiger("Tan");
		
		Lion lucy = new Lion("Lucy");
		Lion lidia = new Lion("Lidia");
		
		Elephant ed = new Elephant("Ed");
		Elephant ema = new Elephant("Ema");
		
		Hippo henry = new Hippo("Henry");
		Hippo holt = new Hippo("Holt");
		
		Rhino rim = new Rhino("Rim");
		Rhino rob = new Rhino("Rob");
		
		Dog dale = new Dog("Dale");
		Dog dan = new Dog("Dan");
		
		Wolf will = new Wolf("Will");
		Wolf war = new Wolf("War");
		
		animal_list.add(dale);
		animal_list.add(dan);
		animal_list.add(will);
		animal_list.add(war);
		animal_list.add(ed);
                animal_list.add(ema);

                animal_list.add(henry);
                animal_list.add(holt);

                animal_list.add(rim);
                animal_list.add(rob);	
	
		animal_list.add(colt);
                animal_list.add(cam);

                animal_list.add(tim);
                animal_list.add(tan);

                animal_list.add(lucy);
                animal_list.add(lidia);
	
		ZooKeeper.wakeup_animal(animal_list);
		
		ZooKeeper.rollcall_animal(animal_list);
		
		ZooKeeper.feed_animal(animal_list);
		
		ZooKeeper.exercise_animal(animal_list);
		
		ZooKeeper.shutdown(animal_list);
	}

}
