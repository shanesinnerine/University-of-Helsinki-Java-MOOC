
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                return;
            }
            String[] parsedString = input.split(" ");
            for (String word : parsedString){
                System.out.println(word);
            }
        }
    }
}
