/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SHANE
 */
import java.util.ArrayList;

public class Suitcase {
    private int maxWeight;
    private ArrayList<Item> items;
    
    public Suitcase(int maxWeight){
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }
    
    public void addItem(Item newItem){
        if(this.totalWeight() + newItem.getWeight() <= this.maxWeight){
            items.add(newItem);
        }
    }
    
    public String toString(){
        if(items.isEmpty()){
            return "no items (0 kg)";
        }
        if(this.items.size() == 1){
            return this.items.size() + " item (" + this.totalWeight() + " kg)";
        }
        return this.items.size() + " items (" + this.totalWeight() + " kg)";
    }
    
    public void printItems(){
        for(Item item : items){
            System.out.println(item);
        }   
    }
    
    public int totalWeight(){
        int currentWeight = 0;
        for(Item item : items){
            currentWeight += item.getWeight();
        }
        return currentWeight;
    }
    
    public Item heaviestItem(){
        if(this.items.isEmpty()){
            return null;
        }
        Item heaviestItem = items.get(0);
        for(Item item : items){
            if(item.getWeight() > heaviestItem.getWeight()){
                heaviestItem = item;
            }
        }
        return heaviestItem;
    }
}
