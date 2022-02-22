
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SHANE
 */
public class Box implements Packable{
    private double capacity;
    private ArrayList<Packable> items;
    
    public Box(double capacity){
        this.capacity = capacity;
        items = new ArrayList<>();
    }
    
    public void add(Packable itemToAdd){
        double weight = this.weight();
        if(weight + itemToAdd.weight() > this.capacity){
            return;
        }
        items.add(itemToAdd);
    }
    
    @Override
    public double weight(){
        double weight = 0;
        for(Packable item : this.items){
            weight += item.weight();
        }
        return weight;
    }
    
    @Override
    public String toString(){
        return "Box: " + this.items.size() + " items, total weight " + this.weight() +" kg";
    }
    
}
