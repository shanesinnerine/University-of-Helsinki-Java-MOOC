
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> testList = new List<>();
        for(int i = 0; i < 20; i ++){
            testList.add(i);
        }
        testList.remove(12);
        testList.add(12);
        testList.print();
    }

}
