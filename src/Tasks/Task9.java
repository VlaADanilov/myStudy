package Tasks;

public class Task9 {
    public static void main(String[] args){
        long ans1 = 0, ans2 = 0;
        long STEP = 1;
        for(int i = 1; i<=args.length-1;i+=1) STEP*=10;
        for (int i = 0, j = args.length-1; i<args.length; i+=1, j-=1 ){
            ans1+=Integer.parseInt(args[i])*STEP;
            ans2+=Integer.parseInt(args[j])*STEP;
            STEP/=10;
        }
        System.out.println(ans1);
        System.out.println(ans2);
    }
}
