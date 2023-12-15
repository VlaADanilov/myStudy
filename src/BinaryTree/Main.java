package BinaryTree;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        for(int i = 0; i<100; i+=1){
            tree.add(new Node((int) (Math.random()*100)));
        }
        tree.output();
    }
}
