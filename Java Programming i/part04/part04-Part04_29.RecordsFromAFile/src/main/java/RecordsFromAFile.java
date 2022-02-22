
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();
        
        try(Scanner fileScanner = new Scanner(Paths.get(fileName))){
            while(fileScanner.hasNextLine()){
                String line = fileScanner.nextLine();
                String[] split = line.split(",");
                System.out.print(split[0] + ", age: " + split[1]);
                if(split[1] == "1") {
                    System.out.println(" year");
                } else {
                    System.out.println(" years");
                }
            }
            
        } catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
