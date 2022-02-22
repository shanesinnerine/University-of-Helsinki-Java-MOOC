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
public class PracticeView {
    private Dictionary dictionary;
    private String word;
    
    public PracticeView(Dictionary dictionary){
        this.dictionary = dictionary;  
        this.word = dictionary.getRandomWord();
    }
    
    public Parent getView(){
        GridPane layout = new GridPane();
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(10, 10, 10, 10));
        layout.setAlignment(Pos.CENTER);
        
        Label instructions = new Label("Translate the word '" + this.word + "'");
        TextField translation = new TextField();
        Label feedback = new Label("");
        Button checkButton = new Button("Check");
        
        checkButton.setOnAction((event) -> {
            if(translation.getText().equals(dictionary.get(word))){
                feedback.setText("Correct!");
            } else{
                feedback.setText("Incorrect! The translation fo the word '" + word + "' is '" + dictionary.get(word) + "'.");
                return;
            }
            
            this.word = this.dictionary.getRandomWord();
            instructions.setText("Translate the word '" + this.word + "'");
            translation.clear();
        });
        
        layout.add(instructions, 0, 0);
        layout.add(translation, 0, 1);
        layout.add(checkButton, 0, 2);
        layout.add(feedback, 0, 3);
        return layout;
    }
}
