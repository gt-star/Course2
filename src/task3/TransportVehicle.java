package task3;

public abstract class TransportVehicle extends ServiceStation {
    private String modelName;
    private int wheelsCount;

    public TransportVehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }
    public TransportVehicle(){}


    public String getModelName() {
        return modelName;
    }

    private void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    private void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
    @Override
    public void check(TransportVehicle transport) {
    }
}
