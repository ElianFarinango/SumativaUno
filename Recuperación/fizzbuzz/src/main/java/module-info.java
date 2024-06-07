module com.example.fizzbuzz {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fizzbuzz to javafx.fxml;
    exports com.example.fizzbuzz;
}