
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String temp = scanner.nextLine();
            if(temp.equals("end")){
                break;
            } else {
                int cubeNumber = (int) Math.pow(Integer.valueOf(temp), 3);
                System.out.println(cubeNumber);
            }
        }
    }
}
