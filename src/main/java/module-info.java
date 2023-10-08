module com.example.pizzasizecomparison {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.example.pizzasizecomparison to javafx.fxml;
    exports com.example.pizzasizecomparison;
}