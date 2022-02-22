
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < 12; i++){
            map.add(i, i);
        }
        map.remove(10);
        map.print();
    }
    

}
