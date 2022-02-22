package ticTacToe;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class TicTacToeApplication extends Application{
    
    

    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        
        GameState state = new GameState();
        
        Label info = new Label("Turn: X");
        info.setPadding(new Insets(10, 10, 10, 20));
        info.setFont(Font.font("Monospaced", 30));
        GridPane game = new GridPane();
        game.setPadding(new Insets(20, 20, 20, 20));
        game.setHgap(10);
        game.setVgap(10);
        
        Button resetButton = new Button("Reset");
        resetButton.setMinSize(100, 30);
        resetButton.setFont(Font.font("Monospaced", 20));
        
        BorderPane layout = new BorderPane();
        layout.setTop(info);
        layout.setCenter(game);
        layout.setBottom(resetButton);
        
        
        
        for(int i = 0; i < 3; i++){
           for(int j = 0; j < 3; j++){
               Button btn = new Button("");
               btn.setMinSize(100, 100);
               btn.setFont(Font.font("Monospaced", 40));
               
               btn.setOnAction((event) -> {
                   if(!btn.getText().equals("") | info.getText().equals("The end!")){
                       return;
                   }
                   if(info.getText().equals("Turn: X")){
                       btn.setText("X");
                       info.setText("Turn: O");
                       state.play("X", game.getRowIndex(btn), game.getColumnIndex(btn));
                       if(state.isWinner("X")){
                           info.setText("The end!");
                       }
                   } else {
                       btn.setText("O");
                       info.setText("Turn: X");
                       state.play("O", game.getRowIndex(btn), game.getColumnIndex(btn));
                       if(state.isWinner("O")){
                           info.setText("The end!");
                       }
                   }
               });
               game.add(btn, j, i);
               
           } 
        }
        
        resetButton.setOnAction((action) -> {
            game.getChildren().stream()
                    .map((node) -> (Button) node)
                    .forEach((button) -> button.setText(""));
            info.setText("Turn: X");
            state.clear();
        });
        
        Scene scene = new Scene(layout);
        
        window.setTitle("Tic Tac Toe");
        window.setScene(scene);
        window.show();
    }

}
