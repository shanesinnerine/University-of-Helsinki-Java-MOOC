
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        String name = "";
        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            String[] parsedInput = input.split(",");
            if(Integer.valueOf(parsedInput[1]) > oldest){   
                oldest = Integer.valueOf(parsedInput[1]);
                name = parsedInput[0];
            }
        }
        System.out.println("Name of the oldest: " + name);

    }
}
