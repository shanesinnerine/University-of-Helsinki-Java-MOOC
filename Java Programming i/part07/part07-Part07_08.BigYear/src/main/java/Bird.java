/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SHANE
 */
public class Bird {
    private String name;
    private String latinName;
    private int observations;
    
    public Bird(String name, String latinName){
        this.name = name;
        this.latinName = latinName;
        this.observations = 0;
    }
    
    public void addObservation(){
        this.observations += 1;
    }
    
    @Override
    public boolean equals(Object o){
        if(o == this){
            return true;
        }
        if(!(o instanceof Bird)){
            return false;
        }
        Bird searchedBird = (Bird) o;
        if((this.getName()).equals(searchedBird.getName())){
            return true;
        }
        return false;
    }
    
    @Override
    public String toString(){
        return this.getName() + " (" + this.getLatinName() + "): " + this.getObservations() + " observations"; 
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the latinName
     */
    public String getLatinName() {
        return latinName;
    }

    /**
     * @return the observations
     */
    public int getObservations() {
        return observations;
    }
}
