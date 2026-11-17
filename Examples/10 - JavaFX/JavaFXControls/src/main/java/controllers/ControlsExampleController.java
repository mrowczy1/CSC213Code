package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Slider;
import javafx.scene.control.Spinner;
import javafx.scene.control.ToggleButton;
import javafx.scene.text.Text;

public class ControlsExampleController {

    @FXML
    private Text text;

    @FXML
    private ToggleButton toggleButton;

    @FXML
    private CheckBox checkBox;

    @FXML
    private Slider slider;

    @FXML
    private Spinner<Integer> spinner;

    @FXML
    private void handleButtonPress() {
        IO.println("You are pushing my buttons.");
    }

    @FXML
    private void handleToggle() {
        var selected = toggleButton.isSelected();
        text.setVisible(selected);
        toggleButton.setText(selected ? "Hide Text" : "Show Text");
    }

    @FXML
    private void handleSelection() {
        var state = checkBox.isSelected() ? "selected" : "deselected";
        IO.println("You have " + state + " the CheckBox!");
    }

    @FXML
    private void handleMouseDragged() {
        IO.println("Slider now at: " + slider.getValue());
    }

    @FXML
    private void handleMouseClicked() {
        IO.println("Spinner now at: " + spinner.getValue());
    }
}