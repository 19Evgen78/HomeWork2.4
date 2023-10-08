package pro.sky.java.course2.hw2;

public class WrongPasswordException extends Exception {
    public WrongPasswordException() {
        super("Используются недопустимые для пароля символы.");
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
