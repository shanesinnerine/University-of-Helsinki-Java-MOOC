
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String temp = scanner.nextLine();
            if(temp.equals("end")){
                break;
            }
            int num = Integer.valueOf(temp);
            System.out.println((int) Math.pow(num, 3));
        }
    }
}
