module com.example.wk10java {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.wk10java to javafx.fxml;
    exports com.example.wk10java;
}