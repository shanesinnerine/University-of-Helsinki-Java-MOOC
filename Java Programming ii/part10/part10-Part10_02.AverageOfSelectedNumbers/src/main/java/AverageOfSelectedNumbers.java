
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Input numbers, type 'end' to stop");
        while(true){
            String input = scanner.nextLine();
            if(input.equals("end")){
                break;
            }
            try{
                int number = Integer.valueOf(input);
                numbers.add(number);
            } catch(NumberFormatException e){
                System.out.println("Not a number!");
            }            
        }
        while(true){
            System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
            String input = scanner.nextLine();
            if(input.equals("n")){
                 System.out.println("Average of the negative numbers: " + String.format("%.2f", negAverage(numbers)));
                 break;
            } else if(input.equals("p")){
                System.out.println("Average of the positive numbers: " + String.format("%.2f", posAverage(numbers)));
                break;
            } else{
                System.out.println("Invalid input");
            }
        }
    }
    
    public static double negAverage(ArrayList<Integer> numbers){
        return numbers.stream()
                .mapToInt(s -> s)
                .filter(number -> number < 0)
                .average()
                .getAsDouble();
    }
    
    public static double posAverage(ArrayList<Integer> numbers){
        return numbers.stream()
                .mapToInt(s -> s)
                .filter(number -> number > 0)
                .average()
                .getAsDouble();
    }
}
