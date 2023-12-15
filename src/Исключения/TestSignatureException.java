package Исключения;

import java.util.Scanner;

public class TestSignatureException {
    public static void main(String[] args) {

        TestNullPointer test = null;

        Double z = null;

        while(z == null) {
            System.out.println("Введите действительное чилсло");
            try {

                z = TestSignatureException.input();

            } catch (MyNumberFormaxException e) {
                System.out.println("Вы ввели не double, идём по новой");
            }

        }
    }

    public static Double input() throws NumberFormatException, MyNumberFormaxException {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        if(!str.matches("[0-9]+\\.?[0-9]+")) {
            throw new MyNumberFormaxException();
        }
        return Double.parseDouble(str);
    }
}
