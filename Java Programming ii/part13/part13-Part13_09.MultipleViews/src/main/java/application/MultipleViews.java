package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application{

    public static void main(String[] args) {
        launch(MultipleViews.class);
    }

    @Override
    public void start(Stage window){
        Label firstLabel = new Label("First View!");
        Button firstButton = new Button("To the second view!");
        BorderPane bpane = new BorderPane();
        bpane.setTop(firstLabel);
        bpane.setCenter(firstButton);
        Scene first = new Scene(bpane);
        
        Button secondButton = new Button("To the third view!");
        Label secondLabel = new Label("Second view!");
        VBox vbox = new VBox();
        vbox.getChildren().add(secondButton);
        vbox.getChildren().add(secondLabel);
        Scene second = new Scene(vbox);
                
        Label thirdLabel = new Label("Third view!");
        Button thirdButton = new Button("To the first view!");
        GridPane gpane = new GridPane();
        gpane.add(thirdLabel, 0, 0);
        gpane.add(thirdButton, 1, 1);
        Scene third = new Scene(gpane);
        
        window.setScene(first);
        window.show();
        firstButton.setOnAction((event) -> window.setScene(second));
        secondButton.setOnAction((event) -> window.setScene(third));
        thirdButton.setOnAction((event) -> window.setScene(first));
    }

}
