
import java.util.*;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                return;
            }
            String[] parsedInput = input.split(" ");
            for(int i = 0; i < parsedInput.length; i++){
                if(parsedInput[i].contains("av")){
                    System.out.println(parsedInput[i]);
                }
            }
        }
        
    }
}
