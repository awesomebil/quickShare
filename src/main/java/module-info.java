module com.example.quickshare {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.quickshare to javafx.fxml;
    exports com.example.quickshare;
}