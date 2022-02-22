/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SHANE
 */
import java.util.Scanner;

public class UserInterface {
    private JokeManager jokes;
    private Scanner scanner;
    
    public UserInterface(JokeManager jokes, Scanner scanner){
        this.jokes = jokes;
        this.scanner = scanner;
    }
    
    public void start(){
         System.out.println("What a joke!");
        while (true) {
        System.out.println("Commands:");
        System.out.println(" 1 - add a joke");
        System.out.println(" 2 - draw a joke");
        System.out.println(" 3 - list jokes");
        System.out.println(" X - stop");
        String command = scanner.nextLine();
        if (command.equals("X")) {
        break;
        }
        if (command.equals("1")) {
            String joke = scanner.nextLine();
            jokes.addJoke(joke);
            continue;
        } 
        if (command.equals("2")) {
            System.out.println(jokes.drawJoke());
            continue;
        } 
        if (command.equals("3")) {
            jokes.printJokes();
            continue;
        }
        }
    }
}
