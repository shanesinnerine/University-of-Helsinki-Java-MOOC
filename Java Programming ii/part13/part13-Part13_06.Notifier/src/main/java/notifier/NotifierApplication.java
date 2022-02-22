package notifier;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class NotifierApplication extends Application{


    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }

    @Override
    public void start(Stage window){
        TextField text = new TextField();
        Button copyButton = new Button("Update");
        Label copiedText = new Label("");
        copyButton.setOnAction((event) -> {
            copiedText.setText(text.getText());
        });
        VBox box = new VBox();
        box.setSpacing(15);
        box.getChildren().add(text);
        box.getChildren().add(copyButton);
        box.getChildren().add(copiedText);
        Scene scene = new Scene(box);
        window.setTitle("Notifier");
        window.setScene(scene);
        window.show();
    }

}
