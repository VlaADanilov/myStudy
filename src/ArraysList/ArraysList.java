package ArraysList;

public class ArraysList {
    public int number;
    public ArraysList next;
    public ArraysList prev;
    ArraysList(int number){
        this.number = number;
        next = null;
        prev = null;
    }
}
