package task3;
public class Truck extends Car {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void check(Service service) {
        System.out.println("Обслуживаем " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        checkTrailer();
        checkEngine();
    }
}
