
import java.nio.file.Paths;
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
    private RecipeList recipes;
    
    public UserInterface(Scanner scanner){
        this.scanner = scanner;
        this.recipes = new RecipeList();
    }
    
    public void start(){
        readRecipes(getFile());
        printInstructions();
        while(true){
            String command = getCommand();
            if(command.equals("stop")){
                break;
            }
            executeCommand(command);
        }
        
    }
    
    public String getFile(){
        System.out.print("File to read: ");
        return scanner.nextLine();
    }
    
    public void readRecipes(String fileName){
        try(Scanner fileScanner = new Scanner(Paths.get(fileName))){
            while(fileScanner.hasNextLine()){
                String name = fileScanner.nextLine();
                int cookingTime = Integer.valueOf(fileScanner.nextLine());
                ArrayList<String> ingredients = new ArrayList<>();
                while(fileScanner.hasNextLine()){
                    String ingredient = fileScanner.nextLine();
                    if(ingredient.isEmpty()){
                        break;
                    }
                    ingredients.add(ingredient);
                }
                Recipe newRecipe = new Recipe(name, cookingTime, ingredients);
                recipes.add(newRecipe);
            }
            
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    
    public void printInstructions(){
        System.out.println("Commands:\n" + "list - lists the recipes\n" + "stop - stops the program\n" + "find name - searches recipes by name");
    }
    
    public String getCommand(){
        System.out.print("Enter command: ");
        return scanner.nextLine();
    }
    
    public void executeCommand(String command){
        if(command.equals("list")){
            recipes.printRecipes();
        }
        if(command.equals("find name")){
            System.out.print("Searched word: ");
            String searchedWord = scanner.nextLine();
            System.out.println("Recipes:");
            recipes.searchName(searchedWord);
        }
        if(command.equals("find cooking time")){
            System.out.print("Max cooking time: ");
            int maxTime = Integer.valueOf(scanner.nextLine());
            System.out.println("Recipes:");
            recipes.searchTime(maxTime);
        }
        if(command.equals("find ingredient")){
            System.out.print("Ingredient: ");
            String ingredient = scanner.nextLine();
            System.out.println("Recipes:");
            recipes.searchIngredient(ingredient);
        }
        
    }
}
