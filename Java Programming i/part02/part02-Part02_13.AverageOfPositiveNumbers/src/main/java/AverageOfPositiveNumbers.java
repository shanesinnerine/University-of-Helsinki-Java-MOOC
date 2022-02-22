
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while(true){
            System.out.println("Give a number:");
            int num = scanner.nextInt();
            if(num == 0){
                break;
            }
            if(num > 0){
                sum += num;
                count++;
            }
        }
        if(count == 0){
            System.out.println("Cannot calculate the average");
        } else{
            double average = (double) sum / count;
            System.out.println(average);
        }
    }
}
