
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SHANE
 */
public class Item {
    private String product;
    private int qty;
    private int unitPrice;
    
    public Item(String product, int qty, int unitPrice){
        this.product= product;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }
    
    public int price(){
        return this.unitPrice * qty;
    }
    
    public void increaseQuantity(){
        this.qty++;
    }
    
    public String getProduct(){
        return this.product;
    }
    
    public int getQty(){
        return this.qty;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Item other = (Item) obj;
        if (!Objects.equals(this.product, other.product)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString(){
        return this.product + ": " + this.qty;
    }
}
