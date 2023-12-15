package ForInterfase;

public class Element implements Comparable {
    public double value;

    public int compareTo(Comparable c){
        if((this.value - ((Element)c).value) > 0){
            return 1;
        }
        if((this.value - ((Element)c).value)<0){
            return -1;
        }
        return 0;
    }
    public Element(double value) { this.value=value;}
    public String toString(){
        return String.valueOf(value);
    }
}
