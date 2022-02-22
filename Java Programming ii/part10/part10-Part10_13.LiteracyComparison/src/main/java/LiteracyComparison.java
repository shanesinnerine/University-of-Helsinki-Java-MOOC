
import java.nio.file.Files;
import java.nio.file.Paths;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        try{
            Files.lines(Paths.get("literacy.csv"))
                    .map(row -> row.split(","))
                    .map(row -> new LiteracyRate(row[3].trim(), Integer.valueOf(row[4]), row[2].substring(1, row[2].length() - 4), Double.valueOf(row[5])))
                    .sorted()
                    .forEach(System.out::println);
        } catch(Exception e){
            System.out.println("Error reading file");
        }
    }
}
