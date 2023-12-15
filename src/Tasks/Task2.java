package Tasks;

import java.util.Scanner;
public class Task2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введи числа k и m");
        int k = scan.nextInt(), m = scan.nextInt();
        for (int i = Math.min(k,m)+1; i<Math.max(k,m); i+=1){
            if (i%3==0){
                System.out.print(i+" ");
            }
        }
    }
}
