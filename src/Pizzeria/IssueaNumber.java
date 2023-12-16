package Pizzeria;

public class IssueaNumber implements GiveNumber {
    private Node nowNum = null;

    private LinkedList list;

    public IssueaNumber(){
        list = new LinkedList();
        for(int i = 1; i<=10; i+=1){
            list.add(i);
        }
        list.close();
    }

    public int next() {
        if (nowNum==null){
            nowNum = list.root;
        }
        else {
            nowNum = nowNum.next;
        }
        return nowNum.getNumber();
    }
}
