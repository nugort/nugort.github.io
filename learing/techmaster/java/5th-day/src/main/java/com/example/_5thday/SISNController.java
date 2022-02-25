package com.example._5thday;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SISNController {
    public TextField label_username;
    public TextField label_password;
    public Button label_forgot_password;
    public Button label_login;
    public Label label_login_status;


    public void onClickLoginButton(ActionEvent actionEvent) {

        label_login_status.setText("Login success!");
    }

    public void onClickForgotPasswordButton(ActionEvent actionEvent) {
    }
}