package com.dan.duedater.duedater;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class guiController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to DueDater");
    }
}