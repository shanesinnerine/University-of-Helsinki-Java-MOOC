package buttonandlabel;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class ButtonAndLabelApplication extends Application{


    public static void main(String[] args) {
        launch(ButtonAndLabelApplication.class);
    }

    @Override
    public void start(Stage stage){
        stage.setTitle("Button and Label");
        FlowPane pane = new FlowPane();
        Scene scene = new Scene(pane);
        Label label = new Label("Press the Button");
        pane.getChildren().add(label);
        Button button = new Button("PRESS ME");
        pane.getChildren().add(button);
        stage.setScene(scene);
        stage.show();
    }

}
