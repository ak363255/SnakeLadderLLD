package ElevatorSystemDesign;

public class ExternalDispatcher implements Dispatcher {
    @Override
    public void dispatchRequest(Request request) {
        for(ElevatorController elevatorController:ElevatorSystem.elevatorControllerList){
            if(request.destination % 2==0 && elevatorController.getElevator().id %2==0){
                elevatorController.addRequest(request);
            }else{
                elevatorController.addRequest(request);
            }
        }
    }
}
