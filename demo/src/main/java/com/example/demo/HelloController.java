package com.example.demo;

import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button saleButton;

    @FXML
    void initialize() {
        assert saleButton != null : "fx:id=\"saleButton\" was not injected: check your FXML file '1hello-view.fxml'.";


    }

}
