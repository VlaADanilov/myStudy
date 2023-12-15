package Tasks;

import java.util.Scanner;
public class Task7 {
    public static void main(String[] args){
        int[] ANS = ВводЧисел();
        int k = 0;
        for (int i =0; i<ANS.length; i+=1){
            if (ЦифрыПоУбыв(ANS[i])){
                k+=1;
                System.out.println(ANS[i]);
            }
        }
        if (k==3) System.out.println("Да, в вашем списке чисел с цифрами по убыванию 3");
        else System.out.println("Чисел по убыванию не 3");
    }
    static int[] ВводЧисел(){
        Scanner sc = new Scanner(System.in);
        int[] quess = new int[100];
        int k = 0;
        while(true){
            String n = sc.nextLine();
            if (n==""){
                break;
            }
            int m = Integer.parseInt(n);
            quess[k]=m;
            k+=1;
            if(k>=quess.length){
                int[] quess2 = new int[k*2];
                for (int i = 0; i<quess.length; i+=1){
                    quess2[i]=quess[i];
                }
                quess=quess2;
            }
        }
        int[] ANS = new int[k];
        for(int i =0;i<k;i+=1){
            ANS[i]=quess[i];
        }
        return ANS;
    }
    static boolean ЦифрыПоУбыв(int a){
        if (a<0) a=a*-1;
        String S = Integer.toString(a);
        if (S.length()==1) return false;
        for(int i = 0; i<S.length()-1;i+=1){
            if(S.charAt(i)<=S.charAt(i+1)) return false;
        }
        return true;
    }
}
