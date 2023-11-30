package com.example.elevatorsimulator;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.ToggleButton;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.util.Duration;

public class ElevatorSimSceneController {

    @FXML
    private Rectangle elevator1;

    @FXML
    private Rectangle elevator2;

    @FXML
    private Rectangle elevator3;

    @FXML
    private Rectangle elevator4;

    @FXML
    private Rectangle elevator5;

    @FXML
    private Text run_simulationCounterText;

    @FXML
    private ToggleButton playButton;

    private int currentFloor = 0;
    private boolean movingUp = true;
    private Timeline elevatorTimeline;

    @FXML
    private void initialize() {
        elevatorTimeline = new Timeline(new KeyFrame(Duration.seconds(2), event -> updateElevator()));
        elevatorTimeline.setCycleCount(Animation.INDEFINITE);
    }

    @FXML
    private void PauseTimeline() {
        if (elevatorTimeline.getStatus() == Animation.Status.RUNNING) {
            elevatorTimeline.pause();
        } else {
            elevatorTimeline.play();
        }
    }

    @FXML
    private void startElevatorMovement() {
        if (playButton.isSelected()) {
            elevatorTimeline.play();
        } else {
            elevatorTimeline.pause();
        }
    }

    private void updateElevator() {
        double elevatorSpeed = 50.0;

        if (movingUp) {
            currentFloor++;
        } else {
            currentFloor--;
        }

        if (currentFloor == 60) {
            movingUp = false;
        } else if (currentFloor == 0) {
            movingUp = true;
        }

        updateElevatorPosition(elevator1);
        updateElevatorPosition(elevator2);
        updateElevatorPosition(elevator3);
        updateElevatorPosition(elevator4);


        run_simulationCounterText.setText(Integer.toString(currentFloor));
    }

    private void updateElevatorPosition(Rectangle elevator) {
        double floorHeight = 11.5;
        double newY = 500.0 - currentFloor * floorHeight;
        elevator.setLayoutY(newY);
    }
}
