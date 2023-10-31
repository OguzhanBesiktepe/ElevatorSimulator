package com.example.elevatorsimulator;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        ElevatorSimulation _simulation = new ElevatorSimulation();
        _simulation.initSimulation("File Name");
        //
    }
}