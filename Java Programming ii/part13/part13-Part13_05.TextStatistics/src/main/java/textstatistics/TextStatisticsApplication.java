package textstatistics;

import javafx.application.Application;
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
        stats.getChildren().add(new Label("Letters: 0"));
        stats.getChildren().add(new Label("Words: 0"));
        stats.getChildren().add(new Label("The longest word is:"));
        layout.setBottom(stats);
        layout.setCenter(new TextArea());
        Scene scene = new Scene(layout);
        stage.setTitle("TextStatistics");
        stage.setScene(scene);
        stage.show();
    }

}
