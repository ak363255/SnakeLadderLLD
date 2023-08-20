package ElevatorSystemDesign;

public class Request {
    Direction direction;
    int destination;
    Request(int destination,Direction direction){
        this.destination = destination;
        this.direction = direction;
    }
}
