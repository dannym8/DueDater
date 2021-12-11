package com.dan.duedater;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.input.MouseEvent;

import java.nio.charset.StandardCharsets;

public class guiController {
    // text field declaration
    @FXML
    public TextField inputField;
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
    // Gets user input text and stores it within
    @FXML
    private void userInput(ActionEvent enterKey) {
        listInput(this.inputField.getText());
        this.inputField.clear();
    }
    // insert input into list
    private void listInput(String input) {
        System.out.println(input);
    }
    // switches toggle button text
    boolean homework = false;
    @FXML
    private void switchToggleText(MouseEvent event) {
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