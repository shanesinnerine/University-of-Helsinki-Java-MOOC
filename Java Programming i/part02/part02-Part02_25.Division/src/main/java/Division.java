
import java.util.Scanner;
public class Division {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numerator = 3;
        int denominator = 2;
        division(numerator, denominator);
    }

    public static void division(int numerator, int denominator){
        double ans = (double) numerator / denominator;
        System.out.println(ans);
    }
}
