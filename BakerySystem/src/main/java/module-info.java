module com.mycompany.bakerysystem {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.bakerysystem to javafx.fxml;
    exports com.mycompany.bakerysystem;
}
