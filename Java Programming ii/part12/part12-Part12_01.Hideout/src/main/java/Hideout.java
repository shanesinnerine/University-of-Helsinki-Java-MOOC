/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SHANE
 */
public class Hideout<T> {
    private T hidden;
    
    public Hideout(){
        
    }
    
    public void putIntoHideout(T toBeHidden){
        this.hidden = toBeHidden;
    }
    
    public T takeFromHideout(){
        T temp = this.hidden;
        this.hidden = null;
        return temp;
    }
    
    public boolean isInHideout(){
        return hidden != null;
    }
}
