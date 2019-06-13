package BinarySearchTree;

public class BinarySearchTree {
    private Node Root = null;

    public void insert(int value){
        Node iterator = Root;
        Node leaf = iterator;
        if(Root != null) System.out.print("root:");
        while (iterator != null){
            System.out.print(iterator.getValue());
            if (iterator.getValue() < value){
                leaf = iterator;
                System.out.print("-right:");
                iterator = iterator.getRight();
            }else {
                leaf = iterator;
                System.out.print("-left:");
                iterator = iterator.getLeft();
            }
        }
        if (leaf == null){
            Root = new Node(value);
            System.out.println("root:   " + value);
        }else if (leaf.getValue() < value){
            leaf.setRight(new Node(value));
            System.out.println("    : " + value);
        }else {
            System.out.println("    : " + value);
            leaf.setLeft(new Node(value));
        }

    }

    public void insertArray(int[] arr){
        for (int i : arr)
            insert(i);
    }

    //test code
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        int[] array = {25,15,50,10,22,4,12,18,14,35,70,31,44,66,90};
        binarySearchTree.insertArray(array);
    }

}
