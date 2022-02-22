
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
    private TodoList list;
    private Scanner scanner;
    
    public UserInterface(TodoList list, Scanner scanner){
        this.list = list;
        this.scanner = scanner;
    }
    
    public void start(){
        while(true){
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if(command.equals("stop")){
                return;
            }
            if(command.equals("add")){
                System.out.print("To add: ");
                String task = scanner.nextLine();
                list.add(task);
            }
            if(command.equals("list")){
                list.print();
            } 
            if(command.equals("remove")){
                System.out.print("Which one is removed: ");
                int taskIndex = scanner.nextInt();
                list.remove(taskIndex);
            } 
        }
    }
}
