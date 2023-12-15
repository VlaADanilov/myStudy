package Исключения;

public class MyNumberFormaxException extends Exception{
    public MyNumberFormaxException(String message) {
        super(message);
    }

    public MyNumberFormaxException() {
        super();
    }
}
