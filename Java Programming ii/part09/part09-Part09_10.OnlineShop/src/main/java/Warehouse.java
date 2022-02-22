
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SHANE
 */
public class Warehouse {
    private Map<String, Integer> productPrices;
    private Map<String, Integer> productStocks;
    
    public Warehouse(){
        productPrices = new HashMap<>();
        productStocks = new HashMap<>();
    }
    
    public void addProduct(String name, int price, int stock){
        this.productPrices.put(name, price);
        this.productStocks.put(name, stock);
    }
    
    public int price(String product){
        return this.productPrices.getOrDefault(product, -99);
    }
    
    public int stock(String product){
        return this.productStocks.getOrDefault(product, 0);
    }
    
    public boolean take(String product){
        if(!productStocks.containsKey(product)){
            return false;
        }
        int stock = this.productStocks.get(product);
        if(stock == 0){
            return false;
        }
        stock--;
        this.productStocks.replace(product, stock);
        return true;
    }
    
    public Set<String> products(){
        return this.productPrices.keySet();
    }
}
