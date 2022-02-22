
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
public class PointsList {
    private ArrayList<Integer> points;
    private double passing;
    
    public PointsList(){
        this.points = new ArrayList<>();
        this.passing = 0;
    }
    
    public int size(){
        return this.points.size();
    }
    
    public void add(int point){
        this.points.add(point);
        if(point >= 50){
            this.passing += 1;
        }
    }
    
    public double averageAll(){
        double average = 0.0;
        for( int point : points){
            average += point;
        }
        average = average / points.size();
        return average;
    }
    
    public double averagePassing(){
        double average = 0.0;
        for( int point : points){
            if(point >= 50){
                average += point;
            }
        }
        average = average / this.passing;
        return average;
    }
    
    public double percentPassing(){
        return (this.passing / this.size()) * 100;  
    }
    
    public int[] gradeDistribution(){
        int[] gradeDistribution = new int[6];
        for(int i = 0; i < points.size(); i++){
            int grade = (points.get(i) - 40) / 10;
            if(grade > 0){
                if(grade > 5){
                    gradeDistribution[5] += 1;
                    continue;
                }
                gradeDistribution[grade] += 1;
            } else{
                gradeDistribution[0] += 1;
            }
            
        }
        return gradeDistribution;
    }
}
