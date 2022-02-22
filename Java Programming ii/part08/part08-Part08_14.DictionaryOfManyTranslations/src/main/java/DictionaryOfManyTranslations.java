
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SHANE
 */
public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> translations;
    
    public DictionaryOfManyTranslations(){
        translations = new HashMap<>();
    }
    
    public void add(String word, String translation){
        if(!translations.containsKey(word)){
            translations.put(word, new ArrayList<String>());
        }
        (translations.get(word)).add(translation);        
    }
    
    public ArrayList<String> translate(String word){
        if(translations.keySet().contains(word)){
            return translations.get(word);
        } else{
            return new ArrayList<String>();
        }
    }
    
    public void remove(String word){
        if(translations.keySet().contains(word)){
            translations.remove(word);
        }
    }
}
