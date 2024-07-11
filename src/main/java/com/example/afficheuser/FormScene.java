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
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setVgap(8);
        gridPane.setHgap(10);

        Label nameLabel = new Label("Name:");
        GridPane.setConstraints(nameLabel, 0, 0);

        TextField nameInput = new TextField();
        GridPane.setConstraints(nameInput, 1, 0);

        Button submitButton = new Button("Submit");
        GridPane.setConstraints(submitButton, 1, 1);

        gridPane.getChildren().addAll(nameLabel, nameInput, submitButton);

        submitButton.setOnAction(e -> {
            // Pass the input data to the DisplayScene
            String name = nameInput.getText();
            DisplayScene displayScene = new DisplayScene(stage, name);
            stage.setScene(displayScene.getScene());
        });

        scene = new Scene(gridPane, 300, 200);
    }

    public Scene getScene() {
        return scene;
    }
}
