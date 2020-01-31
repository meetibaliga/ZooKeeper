package oop.proj.animal;

public abstract class Animal 
{
    private String name = "None";
    
    public Animal(String s){
        this.name = s;
    }
	
    public String sleep() {
    	return "Sleeping.";
    }
    
    public String wakeup() {
    	return "Waking up.";
    }
    
    public String roam() {
    	return "Roaming.";
    }
    
    public String eat() {
    	return "Eating.";
    }
    
    
    public abstract String getType();
    public abstract String getFamily();
    public abstract String makeNoise();
    
    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
