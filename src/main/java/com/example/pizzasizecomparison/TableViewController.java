package com.example.pizzasizecomparison;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class TableViewController implements Initializable {

    @FXML
    private Label header;

    @FXML
    private TableColumn<Pizza, String> pizzaNameColumn;

    @FXML
    private TableColumn<Pizza, Float> priceColumn;

    @FXML
    private TableColumn<Pizza, String> sizeColumn;

    @FXML
    private TableView<Pizza> tableView;

    @FXML
    private TableColumn<Pizza, String> typeColumn;

    private ArrayList<Pizza> allPizzas;

    /*Adding content to the table DB*/
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        allPizzas = DBUtility.getPizzaDataFromDB();

        //configuring the table view column to know where to get data from
        pizzaNameColumn.setCellValueFactory(new PropertyValueFactory<>("pizzaName"));
        typeColumn.setCellValueFactory(new PropertyValueFactory<>("pizzaType"));
        sizeColumn.setCellValueFactory(new PropertyValueFactory<>("pizzaSize"));
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("pizzaPrice"));
        tableView.getItems().addAll(allPizzas);
    }


    /*Connecting both the scene*/
    @FXML
    void viewCharts(ActionEvent event) throws IOException {
        SceneChanger.changeScenes(event, "chart-view.fxml");
    }
}
