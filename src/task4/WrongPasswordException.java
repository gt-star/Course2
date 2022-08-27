package task4;
public class WrongPasswordException extends RuntimeException{

    public void getMessage(String ex) {
        System.out.println(ex);
    }
}
