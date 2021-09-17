module com.example.oke {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.oke to javafx.fxml;
    exports com.example.oke;
}