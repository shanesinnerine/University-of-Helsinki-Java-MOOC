package buttonandtextfield;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class ButtonAndTextFieldApplication extends Application{


    public static void main(String[] args) {
        launch(ButtonAndTextFieldApplication.class);
    }

    @Override
    public void start(Stage stage) {
        FlowPane pane = new FlowPane();
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        Button button = new Button("Grant Wish");
        TextField text = new TextField("Enter Your W");
        pane.getChildren().add(button);
        pane.getChildren().add(text);
        text.setOnMouseClicked((MouseEvent e) -> text.setText(""));
        stage.show();
    }
    

}
