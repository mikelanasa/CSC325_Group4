/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.bakerysystem;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author erickcruz
 */
public class QuaternaryController {

    @FXML
    private Button logOutButton;
    @FXML
    private Button shutDownButton;

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("logInPage");
    }

    @FXML
    private void shutDownApp() {
        Platform.exit();
    }

}
