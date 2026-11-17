import controllers.MultithreadedExample;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * @author Jon Mrowczynski
 */
public class ThreadingExample extends Application {

    @Override
    public void start(final Stage primaryStage) {
        IO.println("Thread's name in start: " + Thread.currentThread().getName());
        primaryStage.setTitle("Running Long Processes");
        primaryStage.setAlwaysOnTop(true); // So app always stays in view in front of everything else.

        ////////////////////////////////////////
        final boolean good = true; // Change me
        ////////////////////////////////////////

        var resourceName = "/long-process-" + (good ? "good" : "bad") + ".fxml";
        var loader = new FXMLLoader(ThreadingExample.class.getResource(resourceName));
        try {
            Scene scene = loader.load();
            primaryStage.setScene(scene);
            if (good) {
                MultithreadedExample multithreadedExample = loader.getController();
                primaryStage.setOnCloseRequest(_ -> multithreadedExample.shutdown());
            }
            primaryStage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}