package com.mycompany.bakerysystem;

import java.io.IOException;
import javafx.fxml.FXML;

public class CustomerOrderController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}