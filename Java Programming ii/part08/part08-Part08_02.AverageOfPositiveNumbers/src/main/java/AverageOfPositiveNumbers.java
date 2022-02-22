
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> positiveNumbers = new ArrayList<>();
        while(true){
            int num = scanner.nextInt();
            if(num == 0){
                break;
            }
            if(num > 0){
                positiveNumbers.add(num);
            }
        }
        if(positiveNumbers.size() == 0){
            System.out.println("Cannot calculate the average");
            return;
        }
        double sum = 0;
        for(int num : positiveNumbers){
            sum += num;
        }
        double average = sum / positiveNumbers.size();
        System.out.println(average);

    }
}
