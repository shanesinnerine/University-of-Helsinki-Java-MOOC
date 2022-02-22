/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.ui;

import FlightControl.logic.FlightControl;
import java.util.Scanner;

/**
 *
 * @author SHANE
 */
public class TextUI {
    private Scanner scanner;
    private FlightControl control;
    
    public TextUI(Scanner scanner, FlightControl control){
        this.scanner = scanner;
        this.control = control;
    }
    
    public void start(){
        while(true){
            System.out.println("Airport Asset Control");
            System.out.println("[1] Add an airplane\n" + "[2] Add a flight\n" + "[x] Exit Airport Asset Control");
            String input = scanner.nextLine();
            if(input.equals("x")){
                break;
            } else if(input.equals("1")){
                System.out.println("Give the airplane id: ");
                String id = scanner.nextLine();
                System.out.println("Give the airplane capacity: ");
                int capacity = Integer.valueOf(scanner.nextLine());
                control.addPlane(id, capacity);
            } else if(input.equals("2")){
                System.out.println("Give the airplane id: ");
                String id = scanner.nextLine();
                System.out.println("Give the departure airport id: ");
                String depId = scanner.nextLine();
                System.out.println("Give the target airport id: ");
                String tarId = scanner.nextLine();
                control.addFlight(control.getPlanes().get(id), depId, tarId);
            }
        }
        while(true){
            System.out.println("Flight Control");
            System.out.println("[1] Print airplanes\n" + "[2] Print flights\n" + "[3] Print airplane details\n" + "[x] Quit");
            String input = scanner.nextLine();
            if(input.equals("x")){
                break;
            } else if(input.equals("1")){
                control.printAirplanes();
            } else if(input.equals("2")){
                control.printFlights();
            } else if(input.equals("3")){
                System.out.println("Give the airplane id: ");
                String id = scanner.nextLine();
                control.printAirplanes(id);
            }
        }
    }
}
