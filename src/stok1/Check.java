package stok1;

public class Check {
    public static void main(String[] args) {
        MyString one = new MyString("aaaaaaaaamvdpmhfimfhdonduindinnnnnnfv");
        MyString two = new MyString("pre[h0iypaaaaaaajergfniobfrninfga");
        MyString three = new MyString("rghklem;rhjiepaaaaanhirhntounarhuinhte");
        MyString four = new MyString("orhjtieirjhtreuhjri9aaaaaoituehaoi");
        MyString five = new MyString("qwertyuiop[]';lkjhghjuyuyaaaaaaaaathagbvbvccvcxcxxxxxxxxxxcvbnm");
        MyString[] mass = new MyString[5];
        mass[0]=one;mass[1]=two;mass[2]=three;mass[3]=four;mass[4]=five;
        MyString ans = mass[0];
        for(int i = 0; i<4; i+=1){
            ans = ans.inOneAndInTwo(mass[i+1]);
        }
        System.out.println(ans);
    }
}
