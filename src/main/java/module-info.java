module com.kevo {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.kevo to javafx.fxml;
    exports com.kevo;
}
