package pro.sky.java.course2.hw2;

public class WrongLoginException extends Exception {
    public WrongLoginException() {
        super("Используются недопустимые для логина символы");
    }

    public WrongLoginException(String message) {
        super(message);
    }
}
