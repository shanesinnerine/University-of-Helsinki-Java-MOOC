
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
public class TodoList {
    private ArrayList<String> list;
    
    public TodoList(){
        this.list = new ArrayList<>();
    }
    
    public void add(String task){
        this.list.add(task);
    }
    
    public void print(){
        for(String task : list){
            System.out.println((list.indexOf(task) + 1) + ": " + task);
        }
    }
    
    public void remove(int num){
        list.remove(num - 1);
    }
    
}
