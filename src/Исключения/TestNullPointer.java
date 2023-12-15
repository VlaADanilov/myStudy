package Исключения;

import java.util.Scanner;

public class TestNullPointer {

    public static void main(String[] args) {

        TestNullPointer test = null;

        try{

            Double z = TestNullPointer.input();

            test.print();

            System.out.println("после  print");
        } catch (NullPointerException e){
            System.out.println(e.getClass().getName());

            System.out.println("Данные не полные");
        } catch (NumberFormatException e){
            System.out.println(e.getClass().getName());

            System.out.println("Это не Double");
        } catch(Exception e){
            System.out.println("Exception ");
        }

        System.out.println("Продолжаем работу");

    }

    public void print(){
        System.out.println("test");
    }

    public static Double input(){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        return Double.parseDouble(str);
    }
}
