package DoublyLinkedList;

public class Node {
    private int Value;
    private Node Next;
    private  Node Previous;
    public Node(int value) {
        Value = value;
        Next = null;
        Previous = null;
    }
    public Node(int value, Node next) {
        Value = value;
        Next = next;
        Previous = null;
    }
    public Node(int value, Node next, Node previous) {
        Value = value;
        Next = next;
        Previous = previous;
    }

    public int getValue() { return Value; }

    public Node getNext() { return Next; }

    public Node getPrevious() { return Previous; }

    public boolean hasNext(){ return (Next!=null); }

    public boolean hasPrevious(){ return (Previous!=null); }

    public void setValue(int value) { Value = value; }

    public void setNext(Node next) { Next = next; }

    public void setPrevious(Node previous) { Previous = previous; }
}
