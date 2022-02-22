
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
public class Herd implements Movable{
    private ArrayList<Movable> movables;
    
    public Herd(){
        this.movables = new ArrayList<>();
    }
    
    public void addToHerd(Movable movable){
        this.movables.add(movable);
    }
    
    @Override
    public void move(int dx, int dy){
        for(Movable movable : movables){
            movable.move(dx, dy);
        }
    }
    
    public String toString(){
        String output = "";
        for(Movable movable : movables){
            output += movable.toString() +"\n";
        }
        return output;
    }
}
