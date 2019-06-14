package Tree;

import BinarySearchTree.*;
import java.util.Queue;
import java.util.LinkedList;

public class BFS {

    public void traverse(Node node){
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(node);
        while (!queue.isEmpty()) {
            Node tempNode = queue.poll();
            System.out.print(tempNode.getValue() + " ");

            if (tempNode.getLeft() != null)
                queue.add(tempNode.getLeft());

            if (tempNode.getRight() != null)
                queue.add(tempNode.getRight());
        }
    }
}
