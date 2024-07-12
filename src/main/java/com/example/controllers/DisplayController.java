package com.example.controllers;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class DisplayController {

    private Stage stage;

    @FXML
    private Label nameLabel;

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public void setName(String name) {
        nameLabel.setText("Hello, " + name);
    }
}
