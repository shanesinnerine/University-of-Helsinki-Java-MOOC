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
public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcasesInHold;
    
    public Hold(int maxWeight){
        this.maxWeight = maxWeight;
        this.suitcasesInHold = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase newSuitcase){
        if(this.totalWeight() + newSuitcase.totalWeight() <= this.maxWeight){
            suitcasesInHold.add(newSuitcase);
        }
    }
    
    public void printItems(){
        for(Suitcase suitcase : suitcasesInHold){
            suitcase.printItems();
        }
    }
    
    public int totalWeight(){
        int totalWeight = 0;
        for(Suitcase suitcase : suitcasesInHold){
            totalWeight += suitcase.totalWeight();
        }
        return totalWeight;
    }
    
    @Override
    public String toString(){
        if(this.suitcasesInHold.size() == 1){
            return this.suitcasesInHold.size() + " suitcase (" + this.totalWeight() + " kg)";
        }
        return this.suitcasesInHold.size() + " suitcases (" + this.totalWeight() + " kg)";
    }
}


