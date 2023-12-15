package ForMe;

import java.util.Scanner;

public class List {
    private int count;
    private LinkedList head;
    List(){
        head=null;
        count = 0;
    }

    public void input(Scanner sc){
        while(sc.hasNext()){
            LinkedList temp = new LinkedList(sc.nextInt());
            add(temp);
        }
    }

    public void add(LinkedList node){
        if(head==null){
            head = node;
        }
        else{
            LinkedList tempOne = head;
            while(tempOne.next!=null){
                tempOne=tempOne.next;
            }
            tempOne.next = node;
        }
        count+=1;
    }

    public void print(){
        LinkedList temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void swap(LinkedList e1, LinkedList e2){
        // ищем элемент перед e1
        if (e1 != head) {
            LinkedList temp = head;
            while (temp.next != e1) {
                temp = temp.next;
            }
            temp.next = e2;
        }
        else{
            head = e2;
        }
        e1.next=e2.next;
        e2.next = e1;
    }

    public void sorted() {
        for (int i = 0; i <= count; i += 1) {
            LinkedList temp = head;
            for (int j = 0; j <= count; j += 1) {
                if (temp.next!=null&&temp.data > temp.next.data) swap(temp, temp.next);
                if(temp.next==null) break;
                temp = temp.next;
                print();
            }
        }
    }
}
