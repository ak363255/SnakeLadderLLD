package ElevatorSystemDesign;

public class Floor {
    int floorId;
    ExternalDispatcher externalDispatcher;
    Floor(int floorId,ExternalDispatcher dispatcher){
       this.floorId = floorId;
       this.externalDispatcher = dispatcher;
    }

    public void submitRequest(Direction direction){
         externalDispatcher.dispatchRequest(new Request(floorId,direction));
    }
}
