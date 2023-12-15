package Tasks;

import java.util.Scanner;
public class Task3 {
    public static void main(String[] args){
        System.out.println("Введи n");
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        System.out.println("Корень числа "+x+" = "+sqrt(x));
    }
    public static double sqrt(double x){
        double AM = x*1_000_000;
        long SR = (long) (AM);
        long quess = 0;
        long ZAP = 1_000_000;
        for(long i = 0; i<=x; i+=1){
            if ((i*1000)*(i*1000)<=SR&&SR<=((i+2)*1000)*((i+2)*1000)){
                if (SR==i*i*1_000_000) return i;
                if (SR==(i+2)*(i+2)*1_000_000) return i+2;
                quess = (i+1)*ZAP;
                break;
            }
        }
        SR*=1_000_000;
        ZAP/=10;
        for(int i=1; i<=6;i+=1){
            for(long j = quess; j<=quess+9*ZAP; j+=ZAP){
                if ((j*j)<=SR&&SR<=(j+2*ZAP)*(j+2*ZAP)){
                    if (SR==j*j){
                        double M = j;
                        return M/1000000;
                    }
                    if (SR==(j+2*ZAP)*(j+2*ZAP)){
                        double M = j+2*ZAP;
                        return M/1000000;
                    }
                    if(SR>=(j+ZAP)*(j+ZAP)) quess = j+ZAP;
                    break;
                }
            }
            ZAP/=10;
        }
        double quess1 = (double) quess;
        double U = quess1/1_000_000;
        return U;
    }
}
