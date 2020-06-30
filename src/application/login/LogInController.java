package application.login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.awt.*;
import java.util.ArrayList;

public class LogInController {

    @FXML
    private TextField username;
    @FXML
    private TextField password;
    @FXML
    private Button login;
    @FXML
    private Button cancel;


    @FXML
    public void login(ActionEvent event){
        String name = username.getText();
    }
}
