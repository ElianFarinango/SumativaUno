module com.example.sumativainicial {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sumativainicial to javafx.fxml;
    exports com.example.sumativainicial;
}