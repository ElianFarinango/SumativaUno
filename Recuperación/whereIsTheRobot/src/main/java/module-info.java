module com.example.whereistherobot {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.whereistherobot to javafx.fxml;
    exports com.example.whereistherobot;
}