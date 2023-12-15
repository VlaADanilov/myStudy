package Tasks;

import java.util.Scanner;
public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи строки, нажми энтер на пустой строке, чтобы перейти дальше");
        String[] Массив = ВводСтрок();
        System.out.println("Введи подстроку");
        String Подстрока = sc.nextLine();
        Подстрока = Подстрока.toLowerCase();
        for(int i = 0; i<Массив.length; i+=1){
            if (Массив[i].toLowerCase().contains(Подстрока)) System.out.println(i);
        }
    }
    static String[] ВводСтрок(){
        Scanner sc = new Scanner(System.in);
        String[] quess = new String[100];
        int k = 0;
        while(true){
            String n = sc.nextLine();
            if (n==""){
                break;
            }
            quess[k]=n;
            k+=1;
            if(k>=quess.length){
                String[] quess2 = new String[k*2];
                for (int i = 0; i<quess.length; i+=1){
                    quess2[i]=quess[i];
                }
                quess=quess2;
            }
        }
        String[] ANS = new String[k];
        for(int i =0;i<k;i+=1){
            ANS[i]=quess[i];
        }
        return ANS;
    }
}
