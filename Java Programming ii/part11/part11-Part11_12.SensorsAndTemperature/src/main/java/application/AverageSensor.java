/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SHANE
 */
public class AverageSensor implements Sensor{
    private ArrayList<Sensor> sensors;
    private List<Integer> readings;
    
    public AverageSensor(){
        this.sensors = new ArrayList<>();
        readings = new ArrayList<>();
    }
    
    public void addSensor(Sensor sensor){
        sensors.add(sensor);
    }
    
    @Override
    public boolean isOn(){
        if(sensors.size() == 0){
            return false;
        }
        for(Sensor sensor : sensors){
            if(!sensor.isOn()){
                return false;
            }
        }
        return true;
    }
    @Override
    public void setOff(){
        sensors.stream().forEach(Sensor::setOff);
    }
    @Override
    public void setOn(){
        sensors.stream().forEach(Sensor::setOn);
    }
    
    @Override
    public int read(){
        if (this.isOn()){
            int value = (int) sensors.stream().mapToInt(sensor -> sensor.read()).average().getAsDouble();
            readings.add(value);
            return value;
        }
        throw new IllegalStateException("Off");
    }
    
    public List<Integer> readings(){
        return this.readings;
    }
}
