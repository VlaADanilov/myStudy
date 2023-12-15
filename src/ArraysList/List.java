package ArraysList;

import ForMe.LinkedList;

import java.util.Scanner;

public class List {
    private ArraysList head;
    private int count;
    List(){
        head = null;
        count = 0;
    }

    public void input(Scanner sc){
        while(sc.hasNext()){
            ArraysList temp = new ArraysList(sc.nextInt());
            add(temp);
        }
    }

    public void add(ArraysList arraysList){
        if (head==null){
            head = arraysList;
        }
        else{
            ArraysList temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = arraysList;
            arraysList.prev = temp;
        }
        count+=1;
    }

    public void toStr(){
        ArraysList temp = head;
        while(temp!=null){
            System.out.println(temp.number);
            temp = temp.next;
        }
    }

    /* 3.1 Сравнение элементов
    3.2 Перестановка соседних элементов
     */

    public void swap(ArraysList e1, ArraysList e2){
        if(e1.prev!=null){
            ArraysList temp1 = e1.prev;
            temp1.next=e2;
            e2.prev = temp1;
        }
        else{
            e2.prev=null;
            head=e2;
        }

        if(e2.next!=null){
            ArraysList temp2 = e2.next;
            e1.next=temp2;
            temp2.prev = e1;
        }
        else{
            e1.next=null;
        }

        e2.next=e1;
        e1.prev = e2;   // 1 2 3; 2.prev = null; e1.next = 3; 3.prev = 1; 2.next = 1; 1.prev = 2;
        // 2

    }

    public void sorted() {
        for (int i = 0; i <= count; i += 1) {
            ArraysList temp = head;
            for (int j = 0; j <= count; j += 1) {
                if (temp.next!=null&&temp.number > temp.next.number) swap(temp, temp.next);
                if(temp.next==null) break;
                temp = temp.next;
            }
        }
    }

    public void reverced(){
        ArraysList temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        while(temp!=null){
            System.out.println(temp.number);
            temp=temp.prev;
        }
    }
}
