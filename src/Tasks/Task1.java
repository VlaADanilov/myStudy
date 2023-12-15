package Tasks;

import java.util.Scanner;
public class Task1 {
    public static void main(String[] args){
        System.out.println("Введи число n");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        //Первый треугольник
        TR1(n);
        //другие два треугольника
        TR2(n);
    }
    static void TR1(int n){
        for (int i = 1; i<=n;i+=1){
            for(int x=0;x<n;x+=1){
                System.out.print(' ');
            }
            for(int j = 0; j<(n-i);j+=1){
                System.out.print(' ');
            }
            for(int j = 0; j<(i*2)-1; j+=1){
                System.out.print('*');
            }
            System.out.println();
        }
    }
    static void TR2(int n){
        for (int i = 1; i<=n;i+=1){
            for(int j = 0; j<n-i; j+=1){
                System.out.print(' ');
            }
            for(int j = 0;j<(i*2)-1;j+=1){
                System.out.print('*');
            }
            System.out.print(' ');
            for(int j = 0; j<2*(n-i); j+=1){
                System.out.print(' ');
            }
            for(int j = 0;j<(i*2)-1;j+=1){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
