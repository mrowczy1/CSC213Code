package controllers;

import javafx.fxml.FXML;

public final class SingleThreadedExample extends ThreadedExample {
    @FXML
    @Override
    protected void handleLongProcess() {
        isRunning(true);
        longProcess();
        isRunning(false);
    }
}