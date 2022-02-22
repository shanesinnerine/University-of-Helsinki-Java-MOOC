/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.domain;

/**
 *
 * @author SHANE
 */
public class Place {
    private String id;

    public Place(String id) {
        this.id = id;
    }
    
    @Override
    public boolean equals(Object compared){
        if(this == compared){
            return true;
        }
        if(!(compared instanceof Place)){
            return false;
        }
        Place comparedPlace = (Place) compared;
        return comparedPlace.id.equals(this.id);
    }
    
    @Override
    public String toString(){
        return this.id;
    }
}
