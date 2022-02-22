/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SHANE
 */
public class ProductWarehouseWithHistory extends ProductWarehouse{
    private ChangeHistory history;
    
    public ProductWarehouseWithHistory(String name, double capacity, double initialBalance){
        super(name, capacity);
        this.history = new ChangeHistory();
        this.history.add(initialBalance);
        super.addToWarehouse(initialBalance);
    }
    
    public String history(){
        return this.history.toString();
    }
    
    @Override
    public void addToWarehouse(double amount){
        super.addToWarehouse(amount);
        history.add(super.getBalance());
    }
    
    @Override
    public double takeFromWarehouse(double amount){
        double returnValue = super.takeFromWarehouse(amount);
        history.add(super.getBalance());
        return returnValue;
    }
    
    public void printAnalysis(){
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + history());
        System.out.println("Largest amount of product: " + history.maxValue());
        System.out.println("Smallest amount of product: " + history.minValue());
        System.out.println("Average: " + history.average());
    }
}
