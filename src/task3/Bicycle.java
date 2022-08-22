package task3;
public class Bicycle extends Car {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void checkEngine() {
        System.out.println("Нет двигателя");
    }
    public  void checkTrailer() {
        System.out.println("Нет прицепа");
    }
}
