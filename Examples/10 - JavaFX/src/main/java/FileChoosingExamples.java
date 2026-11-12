import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.*;
import java.nio.file.Files;
import java.util.Scanner;

/**
 * @author Jon Mrowczynski
 */
public class FileChoosingExamples {

	private final FileChooser fileChooser = new FileChooser();
	
	void runExamples(final Stage primaryStage) {
		fileChooserExample(primaryStage);
//		fileSaverExample(primaryStage);
	}

	private void fileChooserExample(final Stage stage) {
		fileChooser.setTitle("File Selector!");
//		fileChooser.setInitialDirectory(new File(System.getProperty("user.home")));
		fileChooser.setInitialDirectory(new File("."));
		final var inputFile = fileChooser.showOpenDialog(stage);
		if (inputFile == null) {
			IO.println("File not chosen.");
			return;
		}
		// Do Something with the file just like any other file.
		try {
			var data = Files.readString(inputFile.toPath());
			var outputStr = """
                    The data read was:
                    %s""".formatted(data);
			IO.println(outputStr);
		}
		catch (IOException e) { throw new RuntimeException(e); }
	}
	
	private void fileSaverExample(final Stage stage) {
		final var outputFile = fileChooser.showSaveDialog(stage);
        if (outputFile == null) {
			IO.println("File not chosen.");
			return;
		}
        // Do something with the file just like any other file.
        try { Files.writeString(outputFile.toPath(), "Writing some data!"); }
        catch (IOException e) { throw new RuntimeException(e); }
    }
}