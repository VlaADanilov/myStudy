package Tasks;

import java.util.Scanner;
public class Task8 {
    public static void main(String[] args){
        System.out.println("Введите n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n<=0) System.err.println("Ошибка");
        else{
            int[] mass = new int[n];
            Заполнитьмассив(mass);
            for (int i =0; i<mass.length;i+=1){
                System.out.print(mass[i]+" ");
            }
        }

    }
    static void Заполнитьмассив(int[] mass){
        mass[0]=1;
        for(int i = 1; i<mass.length; i+=1){
            if(mass[i-1]>0) mass[i]=(-1)*(mass[i-1]+2);
            else mass[i]=(-1)*(mass[i-1]-2);
        }
    }
}
