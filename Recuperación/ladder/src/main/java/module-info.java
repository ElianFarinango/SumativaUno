module com.example.ladder {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ladder to javafx.fxml;
    exports com.example.ladder;
}