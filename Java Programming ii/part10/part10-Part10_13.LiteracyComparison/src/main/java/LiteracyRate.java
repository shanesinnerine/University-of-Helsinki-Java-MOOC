/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SHANE
 */
public class LiteracyRate implements Comparable<LiteracyRate>{
    private String country;
    private int year;
    private String gender;
    private double rate;

    public LiteracyRate(String country, int year, String gender, double rate) {
        this.country = country;
        this.year = year;
        this.gender = gender;
        this.rate = rate;
    }
    
    @Override
    public int compareTo(LiteracyRate otherRate){
        if(this.rate > otherRate.rate){
            return 1;
        } else if(this.rate < otherRate.rate){
            return -1;
        } else{
            return 0;
        }
    }
    
    @Override
    public String toString(){
        return this.country + " (" + this.year + "), " + this.gender + ", " + this.rate;
    }
}
