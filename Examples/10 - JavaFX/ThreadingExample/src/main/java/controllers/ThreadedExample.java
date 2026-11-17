package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.text.Text;

public abstract class ThreadedExample {

    @FXML
    private Button button;

    @FXML
    private ProgressIndicator progressIndicator;

    @FXML
    private Text progressIndicatorText;

    protected void isRunning(boolean isRunning) {
        button.setDisable(isRunning);
        progressIndicator.setVisible(isRunning);
        progressIndicatorText.setVisible(isRunning);
    }

    // Simulate running a long process. Here this process takes 10s.
    protected void longProcess() {
        try {
            Thread.sleep(10_000);
        } catch (final InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    protected abstract void handleLongProcess();

}
