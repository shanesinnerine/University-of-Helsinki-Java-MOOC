
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] username = {"alex", "emma"};
       String[] password = {"sunshine", "haskell"};
        System.out.println("Enter username:");
        String loginUser = scanner.nextLine();
        System.out.println("Enter password:");
        String loginPass = scanner.nextLine();
        for(int i = 0; i < username.length; i++){
            if(loginUser.equals(username[i]) && loginPass.equals(password[i])){
                System.out.println("You have successfully logged in!");
                return;
            }
        }
        System.out.println("Incorrect username or password!");
    }
}
