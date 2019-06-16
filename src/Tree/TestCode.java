package Tree;

import BinarySearchTree.*;

public class TestCode {
    public static void main(String[] args) {
        int[] values = {10,6,15,3,8,20};
        BinarySearchTree BST = new BinarySearchTree();
        BST.insertArray(values);
        System.out.println("Breadth First Search");
        new BFS().traverse(BST.getRoot());
        System.out.println();
        System.out.println("Depth First Search");
        System.out.println("Pre Order");
        new PreOrder().traverse(BST.getRoot());
        System.out.println();
        System.out.println("Post order");
        new PostOrder().traverse(BST.getRoot());
        System.out.println();
        System.out.println("In order");
        new InOrder().traverse(BST.getRoot());
    }
}
