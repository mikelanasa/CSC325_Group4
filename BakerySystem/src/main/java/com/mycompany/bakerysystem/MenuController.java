package com.mycompany.bakerysystem;

import java.io.IOException;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MenuController {
    @FXML
    private Button logOutButton;
    @FXML
    private Button shutDownButton;

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("logInPage");
    }
    
    @FXML
    private void shutDownApp(){
        Platform.exit();
    }
    
    
}