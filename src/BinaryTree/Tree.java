package BinaryTree;

class Tree {
    private Node root;

    public void add(Node node) {
        if (root == null) {
            root = node;
        } else {
            root.add(node);
        }
    }

    public int min(){
        Node temp = root;
        while(temp.left!=null){
            temp = temp.left;
        }
        return temp.value;
    }

    public int max(){
        Node temp = root;
        while(temp.right!=null){
            temp = temp.right;
        }
        return temp.value;
    }

    private void output(Node node){
        if(node != null){
            output(node.left);
            System.out.print(" " + node.value);
            output(node.right);
        }
    }
    public void output(){
        output(root);
    }

    public boolean findNumber(int number){
        boolean flag = false;
        flag = findNumber(root, number);
        return flag;
    }

    private boolean findNumber(Node node, int number){
        boolean flag = false;
        if(node != null){
            if(node.value == number)  return true;
            if(flag==false) flag = findNumber(node.left, number);
            if(flag==true) return true;
            if(flag==false) flag = findNumber(node.right, number);
            if(flag==true) return true;
        }
        return false;
    }
    private int findSmallestInRightUndertree(Node node){
        node = node.right;
        while(node.left!=null){
            node=node.left;
        }
        return node.value;
    }

    private Node deleteNumber(Node node, int number){
        if(node==null) return null;
        if (node.value == number){
            if (node.left==null&&node.right==null){
                return null;
            }
            if(node.right==null){
                return node.left;
            }
            if(node.left==null){
                return node.right;
            }
            int i = findSmallestInRightUndertree(node);
            node.value=i;
            node.right=deleteNumber(node.right,i);
            return node;
        }
        if(node.value>number){
            node.left=deleteNumber(node.left,number);
            return node;
        }
        if(node.value<number){
            node.right=deleteNumber(node.right,number);
            return node;
        }
        return node;
    }
    public void deleteNumber(int number){
        if (findNumber(number)) {
            root = deleteNumber(root, number);
        }
        else{
            System.out.println("Как удалить то, чего нет?");
        }
    }
}
