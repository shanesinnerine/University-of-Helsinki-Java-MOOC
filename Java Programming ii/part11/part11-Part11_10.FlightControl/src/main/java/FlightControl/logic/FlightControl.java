/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.logic;

import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import FlightControl.domain.Place;
import java.util.HashMap;

/**
 *
 * @author SHANE
 */
public class FlightControl {
    private HashMap<String, Airplane> planes;
    private HashMap<String, Flight> flights;
    private HashMap<String, Place> places;
    
    public FlightControl(){
        this.planes = new HashMap<>();
        this.flights = new HashMap<>();
        this.places = new HashMap<>();
    }
    
    public void addPlane(String id, int capacity){
        Airplane newPlane = new Airplane(id, capacity);
        planes.put(id, newPlane);
    }
    
    public void addFlight(Airplane plane, String depId, String tarId){
        places.putIfAbsent(depId, new Place(depId));
        places.putIfAbsent(tarId, new Place(tarId));
        Flight newFlight = new Flight(places.get(depId), places.get(tarId), plane);
        flights.putIfAbsent(newFlight.toString(), newFlight);
    }
    
    public void printAirplanes(String id){
        System.out.println(planes.get(id));
    }
    
    public void printAirplanes(){
        planes.values().stream().forEach(System.out::println);
    }
    
    public void printFlights(){
        flights.values().stream().forEach(System.out::println);
    }

    public HashMap<String, Airplane> getPlanes() {
        return planes;
    }

    public HashMap<String, Flight> getFlights() {
        return flights;
    }

    public HashMap<String, Place> getPlaces() {
        return places;
    }
    
}
