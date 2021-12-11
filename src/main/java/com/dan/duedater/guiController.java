package com.dan.duedater;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ToggleButton;
import javafx.scene.input.MouseEvent;

public class guiController {
    // labels declaration
    @FXML
    private Label welcomeText;
    // menu items declaration
    @FXML
    private MenuItem exit;
    // buttons
    @FXML
    private ToggleButton toggle;

    // exitProgram() when click on file > exit
    @FXML
    void exitProgram(ActionEvent event) {

    }
    // switches toggle button text
    @FXML
    void switchToggleText(MouseEvent event) {

    }
}