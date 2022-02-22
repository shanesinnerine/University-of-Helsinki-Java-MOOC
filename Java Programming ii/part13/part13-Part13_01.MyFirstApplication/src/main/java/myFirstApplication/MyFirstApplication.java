package myFirstApplication;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

public class MyFirstApplication extends Application  {
    

    @Override
    public void start(Stage stage){
        stage.setTitle("Testing");
        Button buttonComponent = new Button("My First button");
        Label text = new Label("My first label");
        buttonComponent.setOnAction((ActionEvent e) -> {
            text.setText("The button has been pressed!");
                });
        BorderPane componentGroup = new BorderPane();
        Scene scene = new Scene(componentGroup, 600, 400);
        componentGroup.setTop(text);
        componentGroup.setCenter(buttonComponent);
        stage.setScene(scene);
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(MyFirstApplication.class);
        
    }

}
