/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SHANE
 */
import java.util.ArrayList;;

public class TodoList {
    private ArrayList<String> list;
    
    public TodoList(){
        list = new ArrayList<>();
    }
    
    public void add(String item){
        list.add(item);
    }
    
    public void remove(int itemNumber){
        list.remove(itemNumber - 1);
    }
    
    public void print(){
        for(int i = 0; i < list.size(); i++){
            System.out.println((i + 1) + ": " + list.get(i));
        }
    }
}
