package BinaryTree;

public class Node {
    public Node left;

    public Node right;

    public int value;

    @Override
    public String toString() {
        return "Node{" +
                " value=" + value +
                '}';
    }



    Node(int value){
        this.value=value;
    }

    public void add(Node node){
        if (node==null){
            return;
        }
        if (node.value<this.value){

            if (this.left==null){
                this.left=node;
            }else {
                this.left.add(node);
            }
        }else {
            if (this.right==null){
                this.right=node;
            }else {
                this.right.add(node);
            }
        }
    }
}
