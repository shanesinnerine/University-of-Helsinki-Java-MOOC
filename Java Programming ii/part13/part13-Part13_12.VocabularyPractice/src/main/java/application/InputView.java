/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

/**
 *
 * @author SHANE
 */
public class InputView {
    private Dictionary dictionary;
    
    public InputView(Dictionary dictionary){
        this.dictionary = dictionary;
    }
    
    public Parent getView(){
        GridPane layout = new GridPane();
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(10, 10, 10, 10));
        layout.setAlignment(Pos.CENTER);
        
        Label wordLabel = new Label("Word: ");
        Label translationLabel = new Label("Translation: ");
        TextField wordField = new TextField();
        TextField translationField = new TextField();
        Button addToDictionaryButton = new Button("Add the word pair");
        
        addToDictionaryButton.setOnAction((event) -> {
            String word = wordField.getText();
            String translation = translationField.getText();
            
            dictionary.add(word, translation);
            wordField.clear();
            translationField.clear();
        });
        
        layout.add(wordLabel, 0, 0);
        layout.add(wordField, 0, 1);
        layout.add(translationLabel, 0, 2);
        layout.add(translationField, 0, 3);
        layout.add(addToDictionaryButton, 0, 4);
        
        return layout;
    }
}
