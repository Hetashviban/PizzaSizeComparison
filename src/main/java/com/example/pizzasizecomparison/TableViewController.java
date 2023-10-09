package com.example.pizzasizecomparison;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;

public class TableViewController {

    @FXML
    private Button buttonPressed;

    @FXML
    private Label header;

    @FXML
    private TableColumn<?, ?> pizzaNameColumn;

    @FXML
    private TableColumn<?, ?> priceColumn;

    @FXML
    private TableColumn<?, ?> sizeColumn;

    @FXML
    private TableColumn<?, ?> typeColumn;

}
