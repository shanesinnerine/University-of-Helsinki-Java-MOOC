
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
public class ChangeHistory {
    private ArrayList<Double> history;
    
    public ChangeHistory(){
        this.history = new ArrayList<>();
    }
    
    public void add(double status){
        this.history.add(status);
    }
    
    public void clear(){
        this.history.clear();
    }
    
    public double maxValue(){
        double max = 0;
        for(double value : history){
            if(value > max){
                max = value;
            }
        }
        return max;
    }
    
    public double minValue(){
        double min = 10000;
        for(double value : history){
            if(value < min){
                min = value;
            }
        }
        return min;
    }
    
    public double average(){
        double sum = 0;
        if(history.size() == 0){
            return sum;
        }
        for(double value : history){
            sum += value;
        }
        return sum / history.size();
    }
    
    public String toString(){
        return this.history.toString();
    }
}
