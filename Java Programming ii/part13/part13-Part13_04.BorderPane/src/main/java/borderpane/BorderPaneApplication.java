package borderpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class BorderPaneApplication extends Application{


    public static void main(String[] args) {
       launch(BorderPaneApplication.class);
    }

    @Override
    public void start(Stage stage){
        BorderPane pane = new BorderPane();
        Scene scene = new Scene(pane);
        stage.setTitle("Border Pane");
        stage.setScene(scene);
        pane.setTop(new Label("NORTH"));
        pane.setRight(new Label("EAST"));
        pane.setBottom(new Label("SOUTH"));
        stage.show();
    }

}
