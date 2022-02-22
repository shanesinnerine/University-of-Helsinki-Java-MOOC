/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SHANE
 */
public class Counter {
    private int value;
    
    public Counter(int startValue){
        this.value = startValue;
    }
    public Counter(){
        this(0);
    }
    
    public void increase(int amount){
        if(amount >= 0){
            this.value += amount;
        }
    }
    public void increase(){
        this.increase(1);
    }
    
    public void decrease(int amount){
        if(amount >= 0){
            this.value -= amount;
        }
    }
    public void decrease(){
        this.decrease(1);
    }
    
    public int value(){
        return this.value;
    }
    
}
