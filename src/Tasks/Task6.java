package Tasks;

import java.util.Scanner;
public class Task6 {
    public static void main(String[] args){
        System.out.println("Введите коэффиценты a,b,c для квадратного уравнения");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if (a==0){
            System.out.println("Это обычное линейное уравнение");
            System.out.println(b+"x"+"="+-c);
            System.out.println("Корень = "+(-c/b));
        }
        else {
            if (b > 0 && c > 0) System.out.println(a + "x²" + "+" + b + "x" + "+" + c + "=0");
            if (b > 0 && c <= 0) System.out.println(a + "x²" + "+" + b + "x" + c + "=0");
            if (b <= 0 && c > 0) System.out.println(a + "x²" + b + "x" + "+" + c + "=0");
            if (b <= 0 && c <= 0) System.out.println(a + "x²" + b + "x" + c + "=0");
            РешитьКвадратное(a, b, c);
        }
    }
    static void РешитьКвадратное(double a, double b, double c) {
        double D = b * b - 4 * a * c;
        if (D < 0) System.out.println("Корней нет, Дискриминант отрицательный");
        if (D == 0) System.out.println("Есть один корень = " + (-b / (2 * a)));
        if (D > 0) {
            System.out.println("Есть два корня = " + ((-b + Task3.sqrt(D))/ (2 * a)) + " ; " + ((-b - Task3.sqrt(D))) / (2 * a));
        }
    }
}
