
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SHANE
 */
public class RecipeList {
    private ArrayList<Recipe> recipeList;
    
    public RecipeList(){
        recipeList = new ArrayList<>();    
    }
    
    public void add(Recipe newRecipe){
        this.recipeList.add(newRecipe);
    }
    
    public ArrayList<Recipe> getList(){
        return this.recipeList;
    }
    
    public void printRecipes(){
        for(Recipe recipe : recipeList){
            System.out.println(recipe);
        }
    }
    
    public void searchName(String searchedWord){
        int index = -1;
        for(Recipe recipe : recipeList){
            if((recipe.getName()).contains(searchedWord)){
                index = recipeList.indexOf(recipe);
                System.out.println(recipe);
            }
        }
        if(index == -1){
            System.out.println("No recipes found");
        }
    }
    
    public void searchTime(int maxTime){
        int index = -1;
        for(Recipe recipe : recipeList){
            if(recipe.getCookingTime() <= maxTime){
                index = recipeList.indexOf(recipe);
                System.out.println(recipe);
            }
        }
        if(index == -1){
            System.out.println("No recipes found");
        }
    }
    
    public void searchIngredient(String ingredient){
        int index = -1;
        for(Recipe recipe : recipeList){
            if((recipe.getIngredients()).contains(ingredient)){
                index = recipeList.indexOf(recipe);
                System.out.println(recipe);
            }
        }
        if(index == -1){
            System.out.println("No recipes found");
        }
    }
}
