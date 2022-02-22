/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import static java.lang.Math.abs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 *
 * @author SHANE
 */
public class Dictionary {
    
    private HashMap<String, String> dictionary;
    private ArrayList<String> words;
    
    public Dictionary(){
        this.dictionary = new HashMap<>();
        this.words = new ArrayList<>();
        
        add("word", "sana");
    }
    
    public String get(String word){
        return this.dictionary.get(word);
    }
    
    public void add(String word, String translation){
        if(!words.contains(word)){
            words.add(word);
        }
        
        this.dictionary.put(word, translation);
    }
    
    public String getRandomWord(){
        Random random = new Random();
        int size = words.size();
        if(words.size() == 0){
            size = 1;
        }
        return this.words.get(abs(random.nextInt() % size));
    }
}
