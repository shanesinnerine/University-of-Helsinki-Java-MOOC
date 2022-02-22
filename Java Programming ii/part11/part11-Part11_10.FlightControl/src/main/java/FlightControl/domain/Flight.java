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
public class Flight {
    private Place departure;
    private Place target;
    private Airplane plane;

    public Flight(Place departure, Place target, Airplane plane) {
        this.departure = departure;
        this.target = target;
        this.plane = plane;
    }
    
    public String toString(){
        return this.plane.toString() + " (" + this.departure + "-" + this.target + ")";
    }
}

