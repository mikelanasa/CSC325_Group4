module com.mycompany.bakerysystem {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    
    requires com.google.auth.oauth2;
    requires firebase.admin;
            
    opens com.mycompany.bakerysystem to javafx.fxml;
    exports com.mycompany.bakerysystem;
}
