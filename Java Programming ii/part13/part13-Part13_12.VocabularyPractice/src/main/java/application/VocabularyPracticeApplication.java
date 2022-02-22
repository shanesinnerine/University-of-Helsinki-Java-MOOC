package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


// END SOLUTION
public class VocabularyPracticeApplication extends Application{
    private Dictionary dictionary;
    
    @Override
    public void init() throws Exception{
        this.dictionary = new Dictionary();
    }
    
    public static void main(String[] args) {
        launch(VocabularyPracticeApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        InputView inputView = new InputView(dictionary);
        PracticeView practiceView = new PracticeView(dictionary);
        
        Button inputButton = new Button("Enter new words");
        Button practiceButton = new Button("Practice");
        
        HBox menu = new HBox();
        menu.setPadding(new Insets(10, 10, 10, 10));
        menu.setSpacing(10);
        menu.getChildren().addAll(inputButton, practiceButton);
        
        BorderPane layout = new BorderPane();
        layout.setPadding(new Insets(10, 10, 10, 10));
        layout.setTop(menu);
        layout.setCenter(inputView.getView());
        
        inputButton.setOnAction((event) -> {
            layout.setCenter(inputView.getView());
        });
        
        practiceButton.setOnAction((event) -> {
            layout.setCenter(practiceView.getView());
        });
        
        Scene scene = new Scene(layout, 400, 300);
        
        window.setScene(scene);
        window.show();
    }
}
