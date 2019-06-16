package Tree;

import BinarySearchTree.*;

public class PreOrder {

    public void traverse(Node node){
        System.out.print(" "+node.getValue());
        if (node.hasLeft()) traverse(node.getLeft());
        if (node.hasRight()) traverse(node.getRight());
    }
}
