
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PointsList points = new PointsList();
        UserInterface ui = new UserInterface(points, scanner);
        
        ui.obtainPoints();
        ui.printAverageAll();
        ui.printAveragePassing();
        ui.printPercentPassing();
        ui.printGradeDistribution();
    }
}
