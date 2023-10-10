package com.example.pizzasizecomparison;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.util.ArrayList;

public class TableViewController {

    @FXML
    private Button buttonPressed;

    @FXML
    private Label header;

    @FXML
    private TableColumn<Pizza, String> pizzaNameColumn;

    @FXML
    private TableColumn<Pizza, Float> priceColumn;

    @FXML
    private TableColumn<Pizza, String> sizeColumn;

    @FXML
    private TableColumn<Pizza, String> typeColumn;

    private ArrayList<Pizza> allPizzas;

    @FXML
    void initialize()
    {
        allPizzas = DBUtility.getGodfathersPizzaSizesFromDB();

        //configuring the table view columns to know where to find their data
        pizzaNameColumn.setCellValueFactory(new PropertyValueFactory<>("Pizza Name"));
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("Price"));
        sizeColumn.setCellValueFactory(new PropertyValueFactory<>("Size"));
        typeColumn.setCellValueFactory(new PropertyValueFactory<>("Type"));
    }



    @FXML
    void viewCharts(ActionEvent event) throws IOException {
        SceneChanger.changeScenes(event, "chart-view.fxml");
    }
}
