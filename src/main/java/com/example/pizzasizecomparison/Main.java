package com.example.pizzasizecomparison;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("table-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Pizza size comparison");
        stage.getIcons().add(new Image(Main.class.getResourceAsStream("images/icon.png")));
        stage.setScene(scene);
        stage.show();
    }
}