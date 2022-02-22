import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList();

        while(true) {
            System.out.println("Title:");
            String title = scanner.nextLine();
            if(title.isEmpty()){
                break;
            }
            System.out.println("Pages:");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.println("Pulication year:");
            int publicationYear = Integer.valueOf(scanner.nextLine());
            
            books.add(new Book(title, pages, publicationYear));
        }
        System.out.println("What information will be printed?");
        String parameter = scanner.nextLine();
        if(parameter.equals("everything")){
            for(Book book : books){
                System.out.println(book);
            }
        }else if(parameter.equals("name")){
            for(Book book : books){
                System.out.println(book.getTitle());
            }       
        }
    }
}
