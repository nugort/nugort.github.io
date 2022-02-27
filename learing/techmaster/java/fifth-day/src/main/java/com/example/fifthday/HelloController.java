package com.example.fifthday;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    public TextField text_field_username;
    public TextField text_field_password;
    public Hyperlink hyperlink_forgot_password;
    public Button button_sign_in;
    public Button button_signup;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void onSiginClick(ActionEvent actionEvent) {
    }

    public void onSigupClick(ActionEvent actionEvent) {
    }

    public void onForgotPasswordClick(ActionEvent actionEvent) {
    }
}