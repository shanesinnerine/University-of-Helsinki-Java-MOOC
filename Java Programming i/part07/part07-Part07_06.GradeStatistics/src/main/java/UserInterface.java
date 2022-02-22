/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SHANE
 */
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private PointsList points;
    private Scanner scanner;
    
    public UserInterface(PointsList points, Scanner scanner){
        this.points = points;
        this.scanner = scanner;
    }
    
    public void obtainPoints(){
        while(true){
            System.out.println("Points:");
            int input = Integer.valueOf(scanner.nextLine());
            if(input == -1){
                return;
            }
            if(input <= 100 & input >= 0){
                this.points.add(input);
            }
        }
    }
    public void printAverageAll(){
        System.out.println("Point average (all): " + this.points.averageAll());
    }
    
    public void printAveragePassing(){
        System.out.println("Point average (passing): " + this.points.averagePassing());
    }
    
    public void printPercentPassing(){
        System.out.println("Pass percentage: " + this.points.percentPassing());
    }
    
    public void printGradeDistribution(){
        int[] gradeDistribution = this.points.gradeDistribution();
        System.out.println("Grade Distribution: ");
        for(int i = 5; i >= 0; i--){
            System.out.print(i +": ");
            for(int j = 0; j < gradeDistribution[i]; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    
    
}
