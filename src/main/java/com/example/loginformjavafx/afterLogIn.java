package com.example.loginformjavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class afterLogIn {

    @FXML
    private Button logout;

    public void userLogOut(ActionEvent event) throws IOException{
        Main m = new Main();
        m.changeScene("hello-view.fxml");
    }
}
