package com.example.pizzasizecomparison;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Label;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ChartViewController implements Initializable {

    @FXML
    private Label header;

    @FXML
    private PieChart pieChart;

    /*Adding content to the chart using DB*/
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        PieChart.Data[] pieChartSeries = DBUtility.getPieChartSeries();
        pieChart.getData().addAll(pieChartSeries);

    }

    /*Connecting both the scene*/
    @FXML
    void viewTables(ActionEvent event) throws IOException {
        SceneChanger.changeScenes(event, "table-view.fxml");
    }
}
