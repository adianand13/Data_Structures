package BinarySearchTree;

public class Node {
    private int value;
    private Node Left;
    private Node Right;

    public Node(int value) {
        this.value = value;
    }

    public Node(int value, Node left, Node right) {
        this.value = value;
        Left = left;
        Right = right;
    }

    public int getValue() { return value; }

    public void setValue(int value) { this.value = value; }

    public Node getLeft() { return Left; }

    public void setLeft(Node left) { Left = left; }

    public Node getRight() { return Right; }

    public void setRight(Node right) { Right = right; }
}
