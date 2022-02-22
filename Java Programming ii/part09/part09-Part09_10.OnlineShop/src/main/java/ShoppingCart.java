
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SHANE
 */
public class ShoppingCart {
    private List<Item> items;
    
    public ShoppingCart(){
        items = new ArrayList<>();
    }
    
    public void add(String name, int price){
        Item newItem = new Item(name, 1, price);
        if(items.contains(newItem)){
            items.get(items.indexOf(newItem)).increaseQuantity();
            return;
        }
        items.add(new Item(name, 1, price));
    }
    
    public int price(){
        int sum = 0;
        for(Item item : items){
            sum += item.price();
        }
        return sum;
    }
    
    public void print(){
        for(Item item : items){
            System.out.println(item.getProduct() + ": " + item.getQty());
        }
    }
}
