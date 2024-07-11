package com.example.afficheuser;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class FormScene {
    private Scene scene;
    private Stage stage;

    public FormScene(Stage stage) {
        this.stage = stage;
        createScene();
    }

    private void createScene() {
        // Create UI elements
        GridPane gridPane = new GridPane();
        gridPane.getStyleClass().add("grid-pane");

        Label nameLabel = new Label("Name:");
        nameLabel.getStyleClass().add("label");
        GridPane.setConstraints(nameLabel, 0, 0);

        TextField nameInput = new TextField();
        nameInput.getStyleClass().add("text-field");
        GridPane.setConstraints(nameInput, 1, 0);

        Button submitButton = new Button("Submit");
        submitButton.getStyleClass().add("button");
        GridPane.setConstraints(submitButton, 1, 1);

        gridPane.getChildren().addAll(nameLabel, nameInput, submitButton);

        submitButton.setOnAction(e -> {
            // Pass the input data to the DisplayScene
            String name = nameInput.getText();
            DisplayScene displayScene = new DisplayScene(stage, name);
            stage.setScene(displayScene.getScene());
        });

        scene = new Scene(gridPane, 300, 200);
        scene.getStylesheets().add(getClass().getResource("/style.css").toExternalForm());
    }

    public Scene getScene() {
        return scene;
    }
}
