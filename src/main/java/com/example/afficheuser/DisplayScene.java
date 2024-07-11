package com.example.afficheuser;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DisplayScene {
    private Scene scene;
    private Stage stage;

    public DisplayScene(Stage stage, String name) {
        this.stage = stage;
        createScene(name);
    }

    private void createScene(String name) {
        VBox vbox = new VBox();
        vbox.getStyleClass().add("vbox");

        Label nameLabel = new Label("Hello, " + name + "!");
        nameLabel.getStyleClass().add("label");

        Button backButton = new Button("Back");
        backButton.getStyleClass().add("back-button");

        backButton.setOnAction(e -> {
            FormScene formScene = new FormScene(stage);
            stage.setScene(formScene.getScene());
        });

        vbox.getChildren().addAll(nameLabel, backButton);

        scene = new Scene(vbox, 300, 200);
        scene.getStylesheets().add(getClass().getResource("/style.css").toExternalForm());
    }

    public Scene getScene() {
        return scene;
    }
}
