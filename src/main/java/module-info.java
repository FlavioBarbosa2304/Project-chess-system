module com.flavio.chesssystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.flavio.chesssystem to javafx.fxml;
    exports com.flavio.chesssystem;
}