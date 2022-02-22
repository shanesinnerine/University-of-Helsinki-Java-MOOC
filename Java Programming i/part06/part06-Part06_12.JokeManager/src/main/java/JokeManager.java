/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SHANE
 */
import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    private ArrayList<String> jokes;
    
    public JokeManager(){
        this.jokes = new ArrayList<>();
    }
    
    public void addJoke(String newJoke){
        System.out.println("Write the joke to be added:");
        this.jokes.add(newJoke);
    }
    
    public String drawJoke(){
        System.out.println("Drawing a joke.");
        if (jokes.isEmpty()) {
            return "Jokes are in short supply.";
        } else {
            Random draw = new Random();
            int index = draw.nextInt(jokes.size());
            return jokes.get(index);
        }
    }
    
    public void printJokes(){
        System.out.println("Printing the jokes.");
        for(String joke : jokes){
            System.out.println(joke);
        }
    }
}
