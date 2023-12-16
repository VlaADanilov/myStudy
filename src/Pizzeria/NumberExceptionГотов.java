package Pizzeria;

public class NumberExceptionГотов extends Exception {
    public NumberExceptionГотов() {
        super("Заказ с таким номером уже готов");
    }
}
