module com.example.elevatorsimulation {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.elevatorsimulation to javafx.fxml;
    exports com.example.elevatorsimulation;
}