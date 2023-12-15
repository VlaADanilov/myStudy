package ArraysList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List list = new List();
        list.input(new Scanner(System.in));
        list.sorted();
        list.toStr();
        System.out.println();
        list.reverced();
    }
}
