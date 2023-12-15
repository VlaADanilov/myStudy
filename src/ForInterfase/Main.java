package ForInterfase;

public class Main {
    public static void main(String[] args) {

        SortAlgoritm algoritm = new BableSort();

        Node[] node = new Node[5];

        node[0] = new Node(5);
        node[1] = new Node(7);
        node[2] = new Node(9);
        node[3] = new Node(11);
        node[4] = new Node(2);

        for(Node n : node){
            System.out.println(n);
        }

        algoritm.order(node);

        for(Node n : node){
            System.out.println(n);
        }
        System.out.println();

        Element[] element = new Element[4];
        element[0] = new Element(8.9);
        element[1] = new Element(5.4);
        element[2] = new Element(5.5);
        element[3] = new Element(5.6);

        for(Element n : element){
            System.out.println(n);
        }

        algoritm.order(element);
        System.out.println();

        for(Element n : element){
            System.out.println(n);
        }
    }
}
