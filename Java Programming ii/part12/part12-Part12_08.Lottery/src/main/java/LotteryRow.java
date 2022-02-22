
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        Random random = new Random();
        this.numbers = new ArrayList<>();
        int value = 0;
        for(int i = 0; i < 7; i++){
            while(true){
                value = random.nextInt(40) + 1;
                if(!this.containsNumber(value)){
                    break;
                }
            }
            numbers.add(value);
        }
        // Implement the random number generation here
        // the method containsNumber is probably useful
    }

    public boolean containsNumber(int number) {
        if(numbers.contains(number)){
            return true;
        }
        return false;
    }
}

