package com.dan.duedater;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

public class guiController {
    // text field declaration
    @FXML
    public TextField inputField;
    // list declaration
    @FXML
    public ListView<String> dateList;
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
        String input = this.inputField.getText();
        listInput(input);
    }

    // insert input into list
    private void listInput(String input) {
        if (input.length() < 90) {
            dateList.getItems().add(input);
            this.inputField.clear();
        } else {
            this.inputField.promptTextProperty().set("Enter text here");
            this.inputField.setPromptText("Due Date exceeds length");
        }
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