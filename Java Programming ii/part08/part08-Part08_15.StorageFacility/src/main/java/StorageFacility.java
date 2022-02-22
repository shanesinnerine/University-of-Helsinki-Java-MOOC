
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SHANE
 */
public class StorageFacility {
    private HashMap<String, ArrayList<String>> facility;
    
    public StorageFacility(){
        facility = new HashMap<>();
    }
    
    public void add(String storageUnit, String item){
        if(!facility.keySet().contains(storageUnit)){
            facility.put(storageUnit, new ArrayList<String>());
        }
        facility.get(storageUnit).add(item);
    }
    
    public ArrayList<String> contents(String storageUnit){
        if(this.facility.containsKey(storageUnit)){
            return this.facility.get(storageUnit);
        }
        return new ArrayList<>();
    }
    
    public void remove(String storageUnit, String item){
        if(this.facility.containsKey(storageUnit)){
            ArrayList<String> unit = facility.get(storageUnit);
            if(unit.contains(item)){
                unit.remove(item);
            }
        }
    }
    
    public ArrayList<String> storageUnits(){
        ArrayList<String> storageUnits = new ArrayList<>();
        for(String storageUnit : facility.keySet()){
            if(facility.get(storageUnit).isEmpty()){
                continue;
            }
            storageUnits.add(storageUnit);
        }
        return storageUnits;
    }
}
