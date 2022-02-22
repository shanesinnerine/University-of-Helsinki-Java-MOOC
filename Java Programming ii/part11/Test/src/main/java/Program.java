/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SHANE
 */
public class Program{
    public static void main(String[] args) {
        Statistics st = new Statistics();
        System.out.println("Printing the average of the statistics: " + st.average());
        System.out.println("Adding number 22");
        st.add(22);
        System.out.println("Printing the average of the statistics: " + st.average());
    }
}
