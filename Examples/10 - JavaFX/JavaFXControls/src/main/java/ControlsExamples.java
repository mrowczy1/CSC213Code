import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ControlsExamples extends Application {
    @Override public void start(final Stage primaryStage) {
        primaryStage.setTitle("Controls Examples");
        var loader = new FXMLLoader(getClass().getResource("/controls-example.fxml"));
        try {
            Scene scene = loader.load();
            primaryStage.setScene(scene);
            primaryStage.sizeToScene();
            primaryStage.show();
        } catch (IOException e) { throw new RuntimeException(e); }
    }
}