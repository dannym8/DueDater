package com.dan.duedater;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Launcher extends Application {
    final static int SCREEN_WIDTH = 900;
    final static int SCREEN_HEIGHT = 650;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Launcher.class.getResource("guiView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 900, 650);
        stage.setTitle("DueDater - Keep track of Due Dates");
        stage.setScene(scene);
        stage.show();
    }

    // All this main method does is run launch()
    public static void main(String[] args) {
        launch();
    }
}