package task3;
public class ServiceStation extends TransportVehicle implements Service {

    @Override
    public void check(Service service) {
        service.check(service);
    }
}

