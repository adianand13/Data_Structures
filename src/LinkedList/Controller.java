package LinkedList;

public class Controller {
    private Node Head;
    private Node Tail;
    private int Length;

    public Controller() {
        Head = null;
        Tail = null;
        Length = 0;
    }

    public boolean isEmpty(){ return (Head == null);}

    public boolean push(int value){
        if (Head==Tail){
            Head = Tail = new Node(value);
            Length ++;
            return true;
        }else{
            Tail.setNext(new Node(value));
            Tail = Tail.getNext();
            Length ++;
            return true;
        }
    }
}
