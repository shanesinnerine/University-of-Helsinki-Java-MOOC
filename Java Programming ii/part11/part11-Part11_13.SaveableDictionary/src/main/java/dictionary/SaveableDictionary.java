/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author SHANE
 */
public class SaveableDictionary {
    private HashMap<String, String> dictionary;
    private String filename;
    
    public SaveableDictionary(){
        dictionary = new HashMap<>();
    }
    
    public SaveableDictionary(String filename){
        dictionary = new HashMap<>();
        this.filename = filename;
    }
    
    public boolean load(){
        try{
            Scanner fileScanner = new Scanner(Paths.get(filename));
            while(fileScanner.hasNextLine()){
                String line = fileScanner.nextLine();
                String[] splitLine = line.split(":");
                this.dictionary.put(splitLine[0], splitLine[1]);
            }
            return true;
        } catch(Exception e){
            return false;
        }
    }
    
    public boolean save(){
        try{
            PrintWriter writer = new PrintWriter(this.filename);
            for(String key : this.dictionary.keySet()){
                writer.println(key + ":" + this.dictionary.get(key));
            }
            writer.close();
            return true;
        } catch(Exception e){
            return false;
        }
    }
    
    public void add(String word, String translation){
        this.dictionary.putIfAbsent(word, translation);
    }
    
    public String translate(String word){
        if(this.dictionary.containsKey(word)){
            return this.dictionary.get(word);
        } else if(this.dictionary.containsValue(word)){
            for(String key : this.dictionary.keySet()){
                if(this.dictionary.get(key).equals(word)){
                    return key;
                }
            }
        }
        return null;
    }
    
    public void delete(String word){
        for(String key : this.dictionary.keySet()){
            if(word.equals(key)){
                this.dictionary.remove(key);
                return;
            } else if(word.equals(this.dictionary.get(key))){
                this.dictionary.remove(key);
                return;
            }           
        }
    }
    
    public void printAll(){
        for(String key : this.dictionary.keySet()){
            System.out.println("Key: " + key + " --- Value: " + this.dictionary.get(key));
        }
    }
}
