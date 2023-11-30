package com.example.elevatorsimulator;

public class AddElevator extends Elevator{
    public AddElevator(){
        this.elevatorType = "";
        this.maxCapacities = 4;
        this.elevatorRequestPercentage = 15.00;

    }
    public AddElevator(String _elevatorType,int _maxCapacities, double _elevatorRequestPercentage){
        this.elevatorType = _elevatorType;
        this.maxCapacities = _maxCapacities;
        this.elevatorRequestPercentage = _elevatorRequestPercentage;

    }
    @Override
    public boolean move(direction _direction) {
        return false;
    }

}


//Constructor: AddElevator()

//Initializes the properties elevatorType, maxCapacities, and elevatorRequestPercentage with default values (empty string, 0, 0.00).
//Constructor: AddElevator(String _elevatorType, int _maxCapacities, double _elevatorRequestPercentage)

//Takes three parameters: _elevatorType (a String), _maxCapacities (an int), and _elevatorRequestPercentage (a double).
//Initializes the properties elevatorType, maxCapacities, and elevatorRequestPercentage with the values passed as parameters.
//Method: move(direction _direction) (Overridden)

//Overrides a method from the superclass Elevator.
//The overridden method returns false, indicating that the elevator doesn't actually move (or the logic for movement is not implemented in this class).
//Key properties in the class:

//elevatorType: Represents the type of the elevator (initialized with an empty string).
//maxCapacities: Represents the maximum capacities of the elevator (initialized with 0).
//elevatorRequestPercentage: Represents the elevator request percentage (initialized with 0.00).