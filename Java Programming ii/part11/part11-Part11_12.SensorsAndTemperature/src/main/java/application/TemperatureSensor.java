/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author SHANE
 */
public class TemperatureSensor implements Sensor{
    private boolean state;
    
    public TemperatureSensor(){
        state = false;
    }
    
    @Override
    public boolean isOn(){
        return this.state;
    }
    @Override
    public void setOff(){
        this.state = false;
    }
    @Override
    public void setOn(){
        this.state= true;
    }
    
    @Override
    public int read(){
        if(this.state){
            int value = new Random().nextInt(61) - 30;
            return value;
        } else{
            throw new IllegalStateException("Off");
        }
    }
    
}
