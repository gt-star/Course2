package task4;

public class WrongLoginException extends RuntimeException {

    public void getMessage(String message) {
        System.out.println(message);
    }
}
