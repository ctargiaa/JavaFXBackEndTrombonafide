module com.trombonafide {
    requires javafx.controls;
    requires javafx.fxml;
    requires json.simple;

    opens com.trombonafide to javafx.fxml;
    exports com.trombonafide;

    opens com.model to javafx.fxml;
    exports com.model;
}
