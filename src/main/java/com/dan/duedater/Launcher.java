package com.dan.duedater;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Launcher extends Application {
    final static int SCREEN_WIDTH = 715;
    final static int SCREEN_HEIGHT = 650;

    // launches the scene and its properties
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Launcher.class.getResource("guiView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), SCREEN_WIDTH, SCREEN_HEIGHT);
        stage.getIcons().add(new Image(Objects.requireNonNull(Main.class.getResourceAsStream("favicon.png"))));
        stage.setMinWidth(715);
        stage.setTitle("DueDater - Keep track of Due Dates");
        stage.setScene(scene);
        stage.show();


    }
    // All this main method does is run launch()
    public static void main(String[] args) {
        launch();
    }
}