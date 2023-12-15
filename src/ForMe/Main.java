package ForMe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        List one = new List();
        Scanner sc = new Scanner(System.in);
        one.input(sc);
        one.sorted();
        one.print();
    }
}
