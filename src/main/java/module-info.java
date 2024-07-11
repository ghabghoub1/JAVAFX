module com.example.afficheuser {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.afficheuser to javafx.fxml;
    exports com.example.afficheuser;
}