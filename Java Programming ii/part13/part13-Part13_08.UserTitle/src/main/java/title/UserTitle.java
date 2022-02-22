package title;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class UserTitle extends Application{

    @Override
    public void start(Stage stage) {
        Parameters params = getParameters();
        String title = params.getUnnamed().get(0);
        FlowPane pane= new FlowPane();
        pane.getChildren().add(new Label(title));
        Scene scene = new Scene(pane);
        stage.setTitle("Display");
        stage.setScene(scene);
        stage.show();
    }


}
