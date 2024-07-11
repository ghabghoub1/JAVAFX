package com.example.afficheuser;

import javafx.application.Application;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        FormScene formScene = new FormScene(primaryStage);
        primaryStage.setScene(formScene.getScene());
        primaryStage.setTitle("JavaFX Multi-Scene Application");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}