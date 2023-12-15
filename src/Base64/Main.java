package Base64;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Base64StringFormatException {
        System.out.println(CoderBase64.arrayToBase64(new byte[]{77,97,110,19}));
        System.out.println(Arrays.toString(CoderBase64.fromBase64ToArray("TWFuEw==")));
        System.out.println(CoderBase64.stringToBase64("Hello"));
        System.out.println(CoderBase64.stringFromBase64("SGVsbG8="));
    }
}
