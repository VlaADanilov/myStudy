package Task3;

import java.util.*;

public class Main {
    public static void main(String[] args) throws NegativeNumberException, SmallerMinException {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Введите число, а я выведу первое число, меньшее этого в массиве");
            double number = sc.nextDouble();
            System.out.println(maxSmallerThis(new int[]{3,5,13,24,35,46,57,68,79},number));
        }catch(NegativeNumberException e){
            System.out.println(e.getMessage());
        }catch(SmallerMinException e){
            System.out.println(e.getMessage());
        }catch(InputMismatchException e){
            System.out.println("Ты ввёл не число, друг...");
        }
        sc.close();
    }

    public static int maxSmallerThis(int[] array, double number) throws NegativeNumberException, SmallerMinException {
        if (number <= 0) throw new NegativeNumberException();

        if (array[0] > number) throw new SmallerMinException();

        for (int i = 1; i < array.length; i += 1) {
            if (number > array[i - 1] && number <= array[i]) {
                return array[i - 1];
            }
        }
        return array[array.length-1];
    }
}
