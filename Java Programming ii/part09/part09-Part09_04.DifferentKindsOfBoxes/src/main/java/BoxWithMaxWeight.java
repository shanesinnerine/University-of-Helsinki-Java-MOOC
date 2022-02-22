
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
public class BoxWithMaxWeight extends Box{
    private int capacity;
    private ArrayList<Item> itemList;
    public BoxWithMaxWeight(int capacity){
        this.capacity = capacity;
        itemList = new ArrayList<>();
    }
    
    @Override
    public void add(Item item){
        if(item.getWeight() > capacity){
            return;
        }
        this.capacity -= item.getWeight();
        itemList.add(item);
    }
    
    @Override
    public boolean isInBox(Item item){
        for(Item itemInBox : itemList){
            if(itemInBox.equals(item)){
                return true;
            }
        }
        return false;
    }
}
