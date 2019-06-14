package Tree;

import BinarySearchTree.*;

public class InOrder {

    public void traverse(Node node){
        if (node.hasLeft()) traverse(node.getLeft());
        System.out.print(" "+node.getValue());
        if (node.hasRight()) traverse(node.getRight());
    }

    //test code
    public static void main(String[] args) {
        int[] values = {10,6,15,3,8,20};
        InOrder inOrder = new InOrder();
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insertArray(values);
        inOrder.traverse(binarySearchTree.getRoot());
    }
}
