package task4;
public class Main {
    public static void main(String[] args) {
        String login = "java_skypro.go";
        String password = "D_1hWiKjjP_9";
        String confirmPassword = "D_1hWiKjjP_9";
        boolean result = Foo(login, password, confirmPassword);
        System.out.println(result);
    }
    public static boolean Foo(String login, String password, String confirmPassword) {
        boolean valid = login.matches("\\w+");
        try {
            if (login.length() <= 20 && password.length() < 20) {
                if (!valid) {
                    throw new WrongLoginException();
                } else if (!password.equals(confirmPassword)) {
                    throw new WrongPasswordException();
                }
            } else {
                System.out.println("Длина больше 20 символов");
                return false;
            }
        }catch (WrongLoginException ex){
            ex.getMessage("Логин не верный");
            return false;
        }catch (WrongPasswordException ex){
            ex.getMessage("Пароль не верный");
            return false;
        }
        return true;
    }
}

