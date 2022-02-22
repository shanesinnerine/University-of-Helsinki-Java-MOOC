
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SHANE
 */
public class Pipe<T> {
    private ArrayList<T> pipe;
    
    public Pipe(){
        this.pipe = new ArrayList<>();
    }
    
    public void putIntoPipe(T value){
        this.pipe.add(value);
    }
    
    public T takeFromPipe(){
        if(pipe.size() == 0){
            return null;
        }
        T temp = this.pipe.get(0);
        this.pipe.remove(temp);
        return temp;
    }
    
    public boolean isInPipe(){
        return this.pipe.size() != 0;
    }
}
