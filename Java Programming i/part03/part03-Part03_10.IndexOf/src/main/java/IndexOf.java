
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");
        System.out.println("Search for?");
        int query = scanner.nextInt();
        int size = list.size();
        for(int i = 0; i < size; i++){
            if(list.get(i) == query){
                System.out.println(query + " is at index " + i);
            }
        }
    }
}
