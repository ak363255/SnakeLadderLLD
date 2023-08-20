package ElevatorSystemDesign;

public class Elevator {
    int id;
    InternalRequestDispatcher internalRequestDispatcher;
    int currentFloor;
    Elevator(InternalRequestDispatcher internalRequestDispatcher){
        this.internalRequestDispatcher = internalRequestDispatcher;
    }

    public void sumbitRequest(int destination){
        Request request = new Request(destination,Direction.DOWN);
        internalRequestDispatcher.submitRequest(request,this);

    }
}
