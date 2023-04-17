module com.mycompany.bakerysystem {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
  requires google.cloud.firestore; // add this line

    
      
    opens com.mycompany.bakerysystem to javafx.fxml;
    exports com.mycompany.bakerysystem;
}
