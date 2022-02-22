
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {     
        int sum = 0;
        int even = 0;
        int odd = 0;
        int count = 0;
        double avg = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        while(true){
            int num = scanner.nextInt();
            if(num == -1){
                System.out.println("Thx! Bye!");
                break;
            }
            sum += num;
            count += 1;
            if((num % 2) == 0){
                even += 1;
            } else{
                odd += 1;
            }
        }
        if(count != 0){
            avg = (double) sum / count;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + avg);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
