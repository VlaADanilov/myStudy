package Tasks;

import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        System.out.println("Введите x");
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        System.out.print("По ряду Макларена sin("+x+") = ");
        Vsin(sin(x));
    }
    public static double sin(double x){
        x =x %(Math.PI * 2);
        double ret = x;
        double Степень = -1;
        double X = x*x*x;
        double Факториал = 6;
        double ПоказательФакториала = 3;
        double rez = X;
        while (rez>0.000_000_001||rez<-0.000_000_001) {
            rez = Степень * X / Факториал;
            Степень *= -1;
            X *= x * x;
            Факториал *= (ПоказательФакториала + 1) * (ПоказательФакториала + 2);
            ПоказательФакториала += 2;
            ret += rez;
        }
        return ret;
    }
    public static void Vsin(double x){
        int P = 1_000_000_000;
        double ANS = x*P;
        ANS=Math.round(ANS);
        ANS/=P;
        System.out.print(ANS);
    }
}