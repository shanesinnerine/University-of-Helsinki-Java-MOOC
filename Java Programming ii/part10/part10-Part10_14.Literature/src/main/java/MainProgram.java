
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> Books = new ArrayList<>();
        
        while(true){
            System.out.print("Input the name of the book, empty stops: ");
            String tempName = scanner.nextLine();
            if(tempName.equals("")){
                break;
            }
            while(true){    
                try{
                    System.out.print("Input the age recommendation: ");
                    int tempRec = Integer.valueOf(scanner.nextLine());
                    Books.add(new Book(tempName, tempRec));
                    break;
                } catch(Exception e){
                    System.out.println("Not a number!");
                }
                
            }
        }
        Comparator<Book> comparator = Comparator
                .comparing(Book::getAgeRecommendation)
                .thenComparing(Book::getName);
        
        System.out.println("\n" + Books.size() + " books in total.\n\nBooks:");
        Books.stream()
                .sorted(comparator)
                .forEach(System.out::println);
    }

}
