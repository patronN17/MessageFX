module com.example.message {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.message to javafx.fxml;
    exports com.example.message;
}