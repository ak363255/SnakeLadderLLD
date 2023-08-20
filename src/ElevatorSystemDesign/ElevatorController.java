package ElevatorSystemDesign;

import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class ElevatorController {

    private Elevator elevator;
    private PriorityQueue<Integer> upRequest;
    private PriorityQueue<Integer> downRequest;
    ElevatorController(Elevator elevator){
        this.elevator = elevator;
        upRequest = new PriorityQueue<>();
        downRequest = new PriorityQueue<>();
    }

    public Elevator getElevator(){
        return  elevator;
    }

    public void addRequest(Request request){
         if(request.direction == Direction.UP){
             upRequest.add(request.destination);
         }else{
             downRequest.add(request.destination);
         }
    }
    private void moveElevator(){

    }
}
