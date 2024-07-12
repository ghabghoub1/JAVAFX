package com.example.controllers;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class FormController {

    private Stage stage;
    private MainApp mainApp;

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }

    @FXML
    private TextField nameInput;

    @FXML
    private Button submitButton;

    @FXML
    private void handleSubmit() {
        String name = nameInput.getText().trim();
        if (!name.isEmpty()) {
            mainApp.showDisplayScene(name);
        }
    }
}
