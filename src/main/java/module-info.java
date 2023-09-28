module com.example.pizzasizecomparison {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pizzasizecomparison to javafx.fxml;
    exports com.example.pizzasizecomparison;
}