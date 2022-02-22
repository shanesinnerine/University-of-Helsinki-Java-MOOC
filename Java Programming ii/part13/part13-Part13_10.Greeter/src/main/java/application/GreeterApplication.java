package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GreeterApplication extends Application{


    public static void main(String[] args) {
        launch(GreeterApplication.class);
    }

    @Override
    public void start(Stage window){
        
        VBox box = new VBox();
        box.setAlignment(Pos.CENTER);
        box.setPadding(new Insets(20, 20, 20, 20));
        box.setPrefSize(200, 100);
        box.setSpacing(10);
        
        Label greeting = new Label("Enter your name and start.");
        TextField name = new TextField();
        Button startButton = new Button("Start");
        Label userName = new Label("");
        
        box.getChildren().add(greeting);
        box.getChildren().add(name);
        box.getChildren().add(startButton);
        Scene first = new Scene(box);
        
        BorderPane bPane = new BorderPane();
        bPane.setPrefSize(200, 100);
        Scene second = new Scene(bPane);
        
        startButton.setOnAction((event) -> {
            userName.setText(name.getText().trim());
            bPane.setCenter(new Label("Welcome " + userName.getText() + "!"));
            window.setScene(second);
        });
        
        window.setTitle("Welcome");
        window.setScene(first);
        window.show();
    }
}
