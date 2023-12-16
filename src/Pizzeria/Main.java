package Pizzeria;

public class Main {
    public static void main(String[] args) {
        IssueaNumber now = new IssueaNumber();
        for(int i = 0; i<=15; i+=1){
            System.out.println(now.next());
        }
    }
}
