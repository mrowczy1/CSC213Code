package controllers;

import javafx.application.Platform;
import javafx.fxml.FXML;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Jon Mrowczynski
 */
public final class MultithreadedExample extends ThreadedExample {

    private final ExecutorService executorService = Executors.newSingleThreadExecutor();

    private final Runnable runnable = () -> {
        longProcess();
        Platform.runLater(() -> isRunning(false));
    };

    @FXML
    @Override
    protected void handleLongProcess() {
        isRunning(true);
        executorService.submit(runnable);
    }

    public void shutdown() { executorService.shutdownNow(); }
}