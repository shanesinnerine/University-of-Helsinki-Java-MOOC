package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class JokeApplication extends Application{


    public static void main(String[] args) {
        launch(JokeApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        
        Button joke = new Button("Joke");
        Button answer = new Button("Answer");
        Button explanation = new Button("Explanation");
        
        HBox menu = new HBox();
        menu.setSpacing(20);
        menu.setPadding(new Insets(20, 20, 20, 20));
        menu.getChildren().addAll(joke, answer, explanation);
        
        Pane jokeLayout = createPane("What do you call a bear with no teeth?");
        Pane answerLayout = createPane("A gummy bear.");
        Pane explanationLayout = createPane("Gummy bears don't have any teeth.");
        
        BorderPane box = new BorderPane();
        box.setTop(menu);
        box.setCenter(jokeLayout);
        box.setPadding(new Insets(20, 20, 20, 20));
        
        joke.setOnAction((event) -> {
            box.setCenter(jokeLayout);
        });        
        answer.setOnAction((event) -> {
            box.setCenter(answerLayout);
        });        
        explanation.setOnAction((event) -> {
            box.setCenter(explanationLayout);
        });
        
        Scene scene = new Scene(box);
        window.setScene(scene);
        window.show();
    }
    
    private Pane createPane(String text){
            Pane pane = new Pane();
            pane.getChildren().add(new Label(text));
            pane.setPadding(new Insets(20, 20, 20, 20));
            return pane;
    }
}
