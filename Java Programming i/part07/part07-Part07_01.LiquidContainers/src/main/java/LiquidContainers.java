
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstVolume = 0;
        int secondVolume = 0;
        int maxVolume = 100;
        int minVolume = 0;
        while (true) {
            System.out.println("First: " + firstVolume + "/100");
            System.out.println("Second: " + secondVolume + "/100");
            System.out.print(">");
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parsedInput = input.split(" ");
            if(parsedInput.length != 2){
                continue;
            }
            String command = parsedInput[0];
            int amount = Integer.valueOf(parsedInput[1]);
            if(amount < 0){
                continue;
            }
            if(command.equals("add")){
                firstVolume += amount;
                if(firstVolume > maxVolume){
                    firstVolume = 100;
                }
            }
            if(command.equals("move")){
                if(firstVolume < amount){
                    amount = firstVolume;
                }
                firstVolume -= amount;
                secondVolume += amount;
                if(secondVolume > maxVolume){
                    secondVolume = 100;
                }
                
            }
            if(command.equals("remove")){
                secondVolume -= amount;
                if(secondVolume < minVolume){
                    secondVolume = 0;
                }
            }
        }
    }

}
