package Pizzeria;

public class NumbersExceptionОбр extends Exception{
    public NumbersExceptionОбр() {
        super("Заказ с таким номером уже есть в обработке");
    }
}
