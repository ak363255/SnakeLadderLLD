package ElevatorSystemDesign;

import java.util.List;

public class ElevatorSystem {

    public static List<ElevatorController> elevatorControllerList;
    private List<Elevator> elevatorList;
    private List<Floor> floorList;
    ElevatorSystem(List<Elevator> elevators,List<Floor> floors){
        this.elevatorList = elevators;
        this.floorList = floors;
    }
}
