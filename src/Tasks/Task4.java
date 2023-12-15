package Tasks;

import java.util.Scanner;
class Task4 {
    public static void main(String[] args){
        System.out.println("Введи число n");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Круг(n);
    }
    static void Круг(int n){
        for (int y = n; y>=-n; y-=1){
            for(int x = -n; x<=n; x+=1){
                if(x*x+y*y<=n*n) System.out.print("**");
                else System.out.print("00");
            }
            System.out.println();
        }
    }
}
