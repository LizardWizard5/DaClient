module com.lizardwizard.daclient {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.lizardwizard.daclient to javafx.fxml;
    exports com.lizardwizard.daclient;
}