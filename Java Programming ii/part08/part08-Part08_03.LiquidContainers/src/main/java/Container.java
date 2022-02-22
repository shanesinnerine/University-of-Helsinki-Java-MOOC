/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SHANE
 */
public class Container {
    private int volume;
    
    public Container(){
        this.volume = 0;
    }
    public void add(int amount){
        if(amount < 0){
            return;
        }
        this.volume += amount;
        if(this.volume > 100){
            this.volume = 100;
        }
    }
    
    public void remove(int amount) {
        if(amount < 0){
            return;
        }
        if(amount > this.volume){
            this.volume = 0;
        } else{
            this.volume -= amount;
        }
    }
    
    public void move(Container receivingContainer, int amount){
        int remainder = 0;
        if(amount > this.volume){
            remainder = amount - this.volume;
        }
        this.remove(amount);
        receivingContainer.add(amount - remainder);
    }
    
    public int getVolume(){
        return this.volume;
    }

}
    
    