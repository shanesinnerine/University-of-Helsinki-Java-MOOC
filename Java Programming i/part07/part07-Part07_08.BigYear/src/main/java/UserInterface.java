
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SHANE
 */
public class UserInterface {
    private Scanner scanner;
    private ArrayList<Bird> birds;
    
    public UserInterface(Scanner scanner, ArrayList<Bird> birds){
        this.scanner = scanner;
        this.birds = birds;
    }
    
    public void start(){
        while(true){
            System.out.print("?");
            String command = scanner.nextLine();
            if(command.equals("Quit")){
                break;
            }
            executeCommand(command);
        }
    }
    
    public void executeCommand(String command){
        if(command.equals("Add")){
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Name in latin: ");
            String latinName = scanner.nextLine();
            Bird newBird = new Bird(name, latinName);
            birds.add(newBird);
        }
        
        if(command.equals("Observation")){
            System.out.print("Bird?");
            String observedBird = scanner.nextLine();
            for(Bird bird : birds){
                if(observedBird.equals(bird.getName())){
                    bird.addObservation();
                }
            }
        }
        
        if(command.equals("All")){
            for(Bird bird : birds){
                System.out.println(bird);
            }
        }
        if(command.equals("One")){
            System.out.print("Bird?");
            String searchedBird = scanner.nextLine();
            for(Bird bird : birds){
                if(searchedBird.equals(bird.getName())){
                    System.out.println(bird);
                }
            }
        }
    }
}
