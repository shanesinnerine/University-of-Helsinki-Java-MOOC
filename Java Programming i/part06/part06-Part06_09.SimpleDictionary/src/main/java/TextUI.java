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

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary simple;
    
    public TextUI(Scanner scanner, SimpleDictionary simple){
        this.scanner = scanner;
        this.simple = simple;
    }
    
    public void start(){
        while(true){
            System.out.println("Command:");
            String command = scanner.nextLine();
            if(command.equals("end")){
                System.out.println("Bye bye!");
                break;
            }
            if(command.equals("add")){
                System.out.println("Word:");
                String word = scanner.nextLine();
                System.out.println("Translation:");
                String translation = scanner.nextLine();
                simple.add(word, translation);
                continue;
            }
            if(command.equals("search")){
                System.out.println("To be translated:");
                String word = scanner.nextLine();
                System.out.println("Translation:");
                String translation = simple.translate(word);
                if(translation == null){
                    System.out.println("Word " + word + " was not found");
                } else{
                    System.out.println(translation);
                }
                continue;
            }
            
            System.out.println("Unknown command");
            
        }
    }
}
