
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();
        while(true){
            System.out.println("Identifier? (Empty will stop)");
            String identifier = scanner.nextLine();
            if(identifier.isEmpty()){
                break;
            }
            System.out.println("Name? (Empty will stop)");
            String name = scanner.nextLine();
            if(name.isEmpty()){
                break;
            }
            Item item = new Item(identifier, name);
            if(items.contains(item)){
                continue;
            }
            items.add(item);
        }
        for(Item item : items){
            System.out.println(item);
        }

    }
}
