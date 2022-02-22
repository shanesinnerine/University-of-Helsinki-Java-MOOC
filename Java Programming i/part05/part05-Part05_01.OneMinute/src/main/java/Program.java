
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Timer timer = new Timer();
        while (true) {
            System.out.println(timer);
            timer.advance();
            System.out.println(timer);
            try {
                Thread.sleep(10);
            } catch (Exception e) {

            }
        }
    }
}
