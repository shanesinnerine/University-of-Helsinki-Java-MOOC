
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> numbers = new ArrayList<>();
        System.out.println("Input numbers, type 'end' to stop");
        while(true){
            String temp = scanner.nextLine();
            if(temp.equals("end")){
                break;
            }
            try{
                int temp1 = Integer.valueOf(temp);
            } catch(NumberFormatException e){
                System.out.println("Not a number!");
                continue;
            }
            numbers.add(temp);
        }
        System.out.println("Average of the numbers: " + average(numbers));
    }
    
    public static double average(ArrayList<String> numbers){
        return numbers.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .average().getAsDouble();
    }
}
