package com.example.afficheuser;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Load the initial scene (FormScene)
        FormScene formScene = new FormScene(primaryStage);
        Scene scene = formScene.getScene();

        // Apply the stylesheet
        scene.getStylesheets().add(getClass().getResource("/style.css").toExternalForm());

        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX Multi-Scene Application");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
