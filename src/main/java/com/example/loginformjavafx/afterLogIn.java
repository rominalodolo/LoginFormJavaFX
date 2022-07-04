package com.example.loginformjavafx;

import javafx.event.ActionEvent;

import java.io.IOException;

public class afterLogIn {

    public void userLogOut(ActionEvent event) throws IOException{
        Main m = new Main();
        m.changeScene("hello-view.fxml");
    }
}
