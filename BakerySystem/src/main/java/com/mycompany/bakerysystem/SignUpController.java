/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.bakerysystem;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author erickcruz
 */
public class SignUpController {

    @FXML
    private TextField firstNameTextField;
    @FXML
    private TextField lastNameTextField;
    @FXML
    private TextField emailTextField;
    @FXML
    private TextField phoneNumberTextField;
    @FXML
    private PasswordField passwordTextField;
    @FXML
    private Label outputLabel;

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("logInPage");
    }

    @FXML
    private void clearFields() {
        firstNameTextField.clear();
        lastNameTextField.clear();
        emailTextField.clear();
        phoneNumberTextField.clear();
        passwordTextField.clear();

    }

    @FXML
    private void registrationForm() {
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        String phoneRegex = "^(\\+\\d{1,2}\\s)?\\(?\\d{3}\\)?[\\s.-]\\d{3}[\\s.-]\\d{4}$";
        Pattern phonePattern = Pattern.compile(phoneRegex);
        if (!emailTextField.getText().isBlank()
                || !passwordTextField.getText().isBlank()
                || !phoneNumberTextField.getText().isBlank()
                || !firstNameTextField.getText().isBlank()
                || !lastNameTextField.getText().isBlank()) {
            //String firstName = firstNameTextField.getText();
            //String lastName = lastNameTextField.getText();
            String email = emailTextField.getText();
            String phoneNumber = phoneNumberTextField.getText();
            //String password = passwordTextField.getText();
            Matcher matcher = pattern.matcher(email);
            Matcher matcherPhone = phonePattern.matcher(phoneNumber);
            if (matcher.matches() == false) {
                outputLabel.setText("Not a valid email");
                return;
            }
            if (matcherPhone.matches() == false) {
                outputLabel.setText("Not a valid phone number");
                return;
            }
            outputLabel.setText("Sign Up Succesful");
            clearFields();

        }

    }

}
