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
        vbox.setPadding(new Insets(10, 10, 10, 10));
        vbox.setSpacing(10);

        Label nameLabel = new Label("Hello, " + name + "!");
        Button backButton = new Button("Back");

        backButton.setOnAction(e -> {
            FormScene formScene = new FormScene(stage);
            stage.setScene(formScene.getScene());
        });

        vbox.getChildren().addAll(nameLabel, backButton);

        scene = new Scene(vbox, 300, 200);
    }

    public Scene getScene() {
        return scene;
    }
}

