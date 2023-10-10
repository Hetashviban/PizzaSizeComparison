package com.example.pizzasizecomparison;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.IOException;

public class ChartViewController {

    @FXML
    private Label header;

    @FXML
    private void initialize()
    {

    }

    @FXML
    void viewTables(ActionEvent event) throws IOException {
        SceneChanger.changeScenes(event, "table-view.fxml");
    }

}
