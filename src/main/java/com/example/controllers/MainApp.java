package com.example.controllers;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApp extends Application {

    private Stage primaryStage;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        showFormScene();
    }

    private void showFormScene() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/form_scene.fxml"));
            Scene scene = new Scene(loader.load());
            FormController controller = loader.getController();
            controller.setMainApp(this);
            controller.setStage(primaryStage);
            scene.getStylesheets().add(getClass().getResource("/style.css").toExternalForm());
            primaryStage.setScene(scene);
            primaryStage.setTitle("JavaFX Application - Form Scene");
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showDisplayScene(String name) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/display_scene.fxml"));
            Scene scene = new Scene(loader.load());
            DisplayController controller = loader.getController();
            controller.setStage(primaryStage);
            controller.setName(name);
            scene.getStylesheets().add(getClass().getResource("/style.css").toExternalForm());
            primaryStage.setScene(scene);
            primaryStage.setTitle("JavaFX Application - Display Scene");
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
