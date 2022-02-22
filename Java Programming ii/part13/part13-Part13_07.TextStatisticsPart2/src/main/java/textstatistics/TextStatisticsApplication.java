package textstatistics;

import java.util.Arrays;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class TextStatisticsApplication extends Application{

public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

    @Override
    public void start(Stage stage){
        BorderPane layout = new BorderPane();
        HBox stats = new HBox();
        stats.setSpacing(20);
        Label letters = new Label("Letters: 0");
        Label wordCount = new Label("Words: 0");
        Label longestWord = new Label("The longest word is: ");
        stats.getChildren().add(letters);
        stats.getChildren().add(wordCount);
        stats.getChildren().add(longestWord);
        layout.setBottom(stats);
        TextArea area = new TextArea();
        layout.setCenter(area);
        area.textProperty().addListener((change, oldValue, newValue) -> {
            int characters = newValue.length();
            String[] parts = newValue.split(" ");
            int words = parts.length;
            if(parts.length == 1 && parts[0].isEmpty()){
                words = 0;
            }
            String longest = Arrays.stream(parts).sorted((s1,s2) -> s2.length() - s1.length()).findFirst().get();
            letters.setText("Letters: " + characters);
            wordCount.setText("Words: " + words);
            longestWord.setText("The longest word is: " + longest);
        });
        Scene scene = new Scene(layout);
        stage.setTitle("TextStatistics");
        stage.setScene(scene);
        stage.show();
    }

}
