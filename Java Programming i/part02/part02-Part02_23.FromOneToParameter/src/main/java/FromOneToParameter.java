
import java.util.Scanner;
public class FromOneToParameter {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int reps = scan.nextInt();
        printUntilNumber(reps);
    }
    public static void printUntilNumber(int reps){
        for(int i = 1; i <= reps; i++){
            System.out.println(i);
        }
    }
}
