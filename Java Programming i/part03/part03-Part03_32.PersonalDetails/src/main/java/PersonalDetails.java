

import java.util.*;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> birthYear = new ArrayList<>();
        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            String[] parsedInput = input.split(",");
            names.add(parsedInput[0]);
            birthYear.add(Integer.valueOf(parsedInput[1]));
        }
        System.out.println("Longest name: " + longestName(names));
        System.out.println("Average of the birth years: " + avg(sumAndCounter(birthYear)));
    }
    
    public static String longestName(ArrayList<String> names){
        String longest = "";
        for (String name : names){
            if (name.length() > longest.length()){
                longest = name;
            }
        }
        return(longest);
    }
    
    public static int[] sumAndCounter(ArrayList<Integer> birthYear){
        int[] sumAndCounter = {0, 0}; 
        for(int year : birthYear){
            sumAndCounter[0] += year;
            sumAndCounter[1]++;
        }
        return(sumAndCounter);
    }
    
    public static double avg(int[] sumAndCounter){
        int sum = sumAndCounter[0];
        int counter = sumAndCounter[1];
        double avg = (double) sum / counter;
        return avg;
    }
}
