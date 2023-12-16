package Pizzeria;

public class LinkedList {
    public Node root;

    public void add(int num){
        Node a = new Node(num);
        if (root == null) {
            root = a;
        }
        else{
            Node temp = root;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=a;
        }
    }

    public void close(){
        Node temp = root;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=root;
    }
}
