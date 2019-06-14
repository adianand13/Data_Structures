package Tree;

import BinarySearchTree.*;

public class PostOrder {
    public void traverse(Node node){
        if (node.hasLeft()) traverse(node.getLeft());
        if (node.hasRight()) traverse(node.getRight());
        System.out.print(" "+node.getValue());
    }

    //test code
    public static void main(String[] args) {
        int[] values = {10,6,15,3,8,20};
        PostOrder postOrder = new PostOrder();
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insertArray(values);
        postOrder.traverse(binarySearchTree.getRoot());
    }
}
