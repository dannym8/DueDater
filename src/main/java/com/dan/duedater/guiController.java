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
    boolean homework = false;
    @FXML
    void switchToggleText(MouseEvent event) {
        if (!homework) {
            toggle.setText("Test    ");
            homework = true;
            System.out.println("In Test Due Date mode");
        } else {
            toggle.setText("Homework");
            homework = false;
            System.out.println("In Homework Due Date mode");
        }
    }
}