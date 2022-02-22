
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Bird> birds= new ArrayList<>();
        UserInterface ui = new UserInterface(scan, birds);
        
        ui.start();

    }

}
