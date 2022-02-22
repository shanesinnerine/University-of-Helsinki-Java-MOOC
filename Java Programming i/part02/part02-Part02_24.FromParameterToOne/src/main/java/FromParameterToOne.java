import java.util.Scanner;

public class FromParameterToOne {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start = scan.nextInt();
        printFromNumberToOne(start);
    }
    public static void printFromNumberToOne(int start){
        for(int i = start; i > 0; i--){
            System.out.println(i);
        }
    }

}
