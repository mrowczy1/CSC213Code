import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 * @author Jon Mrowczynski
 */
public class FileChoosingExamples extends Application {

    private final FileChooser fileChooser = new FileChooser();

    @Override
    public void start(final Stage primaryStage) {
        fileChooser.setInitialDirectory(new File(System.getProperty("user.home")));
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Text Files", "*.txt"));
        fileSaverExample(primaryStage);
        fileChooserExample(primaryStage);

        // Since not closing the primary window (Stage), have to explicitly close application.
        Platform.exit();
    }

    private void fileChooserExample(final Stage stage) {
        final var inputFile = fileChooser.showOpenDialog(stage);
        if (inputFile == null) {
            IO.println("File not chosen to load data.");
            return;
        }
        // Do Something with the file just like any other file.
        try {
            var data = Files.readString(inputFile.toPath());
            IO.println("The data read was: %s".formatted(data));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void fileSaverExample(final Stage stage) {
        final var outputFile = fileChooser.showSaveDialog(stage);
        if (outputFile == null) {
            IO.println("File not chosen to write data.");
            return;
        }
        // Do something with the file just like any other file.
        try {
            Files.writeString(outputFile.toPath(), "Writing some data!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}