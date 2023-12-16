package Pizzeria;

public class Node {
    private int number;
    Node next;

    public Node(int a){
        this.number=a;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
