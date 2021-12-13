package com.dan.duedater;

import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.TextFieldListCell;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class guiController implements Initializable {
    // text field declaration
    @FXML
    public TextField inputField;

    // labels declaration
    @FXML
    private Label welcomeText;
    // menu items declaration
    @FXML
    private MenuItem exit, edit, complete, pend;
    // buttons
    @FXML
    private ToggleButton toggle;
    // list declaration
    @FXML
    public ArrayList<String> arrayList = new ArrayList<>();
    @FXML
    public ListView<String> dateList;
    //text file path, creates it in users root-drive/DueDater/
    String path =  "/DueDater/DueDater_DONOTDELETE.txt";

    public void initialize(URL location, ResourceBundle resources) {
        List<String> rawList;
        try {
            //create dir @ root-drive/DueDater
            Files.createDirectories(Path.of("/DueDater"));
            // Gets text from path
            rawList = Files.lines(Paths.get(path)).toList();
            rawList.forEach( x -> dateList.getItems().add(x));
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Allows double-clicking to edit each cell
        dateList.setCellFactory(TextFieldListCell.forListView());
    }
    // Gets user input text and stores it within
    @FXML
    private void userInput(ActionEvent enterKey) throws IOException {
        String input = this.inputField.getText();
        listInput(input);
    }

    // insert input into list
    private void listInput(String input) throws IOException {
        if (input.length() < 90 && input.length() > 5) {
            String lineSeparator = String.format("%n");
            Files.writeString(Path.of(path), input + lineSeparator,
                    StandardOpenOption.CREATE, StandardOpenOption.APPEND);
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
            toggle.setText("Test      ");
            homework = true;
            System.out.println("In Test Due Date mode");
        } else {
            toggle.setText("Homework");
            homework = false;
            System.out.println("In Homework Due Date mode");
        }
    }
    // edit context menu action
    @FXML
    void editCell (ActionEvent e) {
        dateList.edit(dateList.getItems().indexOf(dateList.getSelectionModel().getSelectedItem()));
    }
    // complete context menu action
    @FXML
    void completeCell(ActionEvent e) {
        dateList.getItems().remove(dateList.getSelectionModel().getSelectedItem());
    }
    // exitProgram() when click on file > exit
    @FXML
    void exitProgram(ActionEvent event) {

    }
}