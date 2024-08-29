package com.kevo;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class PrimaryController {

    @FXML
    private TextField emailInput;

    @FXML
    private ImageView imgx;

    @FXML
    private Button loginUser;

    @FXML
    private PasswordField passwordInput;

    @FXML
    void loginUser(ActionEvent event) throws IOException {
        System.out.println(emailInput.getText());
        System.out.println(passwordInput.getText());
        switchToSecondary(event);
    }
    @FXML
    void SayHelloWorld(ActionEvent event) {
        System.out.println("Hello world");
    }
    @FXML
    void switchToSecondary(ActionEvent event) throws IOException {
        App.setRoot("secondary");
    }
    @FXML
    void showImage(ActionEvent event) {
        imgx.setVisible(!imgx.isVisible());
    }
}
