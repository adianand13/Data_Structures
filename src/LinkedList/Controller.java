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

    public boolean isEmpty() { return (Head == null); }

    public int length() { return Length; }

    public void push(int value) {
        if (Head == null) {
            Head = Tail = new Node(value);
            Length ++;
        } else {
            Tail.setNext(new Node(value));
            Tail = Tail.getNext();
            Length ++;
        }
    }

    public boolean pop() {
        if (Head == null)
            return false;
        else if (Head == Tail) {
            Head = Tail = null;
            Length = 0;
            return true;
        } else {
            Node newTail = Head;
            while (newTail.getNext().hasNext()){
                newTail = newTail.getNext();
            }
            Tail = newTail;
            Tail.setNext(null);
            Length --;
            return true;
        }
    }

    //traverses the entire Linked list
    public void traverse() {
        if (Head == null) System.out.println("Empty List");
        else {
            Node iterator = Head;
            for (int i = 0; i < Length; i++) {
                System.out.print(iterator.getValue() + " ");
                iterator = iterator.getNext();
            }
            System.out.println();
        }
    }

    //Shifts head by one node
    public boolean shift(){
        if (Head == null) return false;
        Head = Head.hasNext() ? Head.getNext() : null;
        Length --;
        return true;
    }

    public boolean remove(int index){
        if (index < 0 || index >= Length)
            System.out.println("IndexOutOfBoundsException");
        else if(index == 0)
            return shift();
        else if (index == Length-1)
            return pop();
        else {
            Node iterator = Head.getNext();
            for (int i = 1; i < index-1; i++)
                iterator = iterator.getNext();
            iterator.setNext(iterator.getNext().getNext());
            Length --;
            return true;
        }
        return false;
    }

    //Insert a new node to start
    public void insertHead(int value){
        if (Head == null) push(value);
        Head = new Node(value,Head);
        Length ++;
    }

    //insert at specific index
    public boolean insert(int index, int value){
        if (index < 0 || index >= Length)
            System.out.println("IndexOutOfBoundsException");
        else if(index == 0){
            insertHead(value);
            return true;
        }
        else if (index == Length-1){
            push(value);
            return true;
        }
        else {
            Node iterator = Head.getNext();
            for (int i = 1; i < index; i++)
                iterator = iterator.getNext();
            iterator.setNext(new Node(value,iterator.getNext()));
            Length ++;
            return true;
        }
        return false;
    }

    public int get(int index){
        if (index < 0 || index >= Length)
            System.out.println("IndexOutOfBoundsException");
        else if(index == 0)
            return Head.getValue();
        else if (index == Length-1)
            return Tail.getValue();
        else {
            Node iterator = Head.getNext();
            for (int i = 1; i <= index; i++)
                iterator = iterator.getNext();
            return iterator.getValue();
        }
        return Integer.MIN_VALUE;
    }

    public boolean set(int value, int index){
        if (index < 0 && index >= Length){
            System.out.println("IndexOutOfBoundsException");
            return false;
        }
        else if(index == 0)
            Head.setValue(value);
        else if (index == Length-1)
            Tail.setValue(value);
        else {
            Node iterator = Head.getNext();
            for (int i = 1; i < index; i++)
                iterator = iterator.getNext();
            iterator.setValue(value);
        }
        return true;
    }

    //to reverse the linked list
    public void reverse(){
        Node node = Head;
        Head = Tail;
        Tail = node;
        Node prev = null, next;
        for (int i = 0; i < Length; i++) {
            next = node.getNext();
            node.setNext(prev);
            prev = node;
            node = next;
        }

    }
    //test code
    public static void main(String[] args) {
        Controller Dlist = new Controller();
        System.out.println(Dlist.isEmpty());
        System.out.println("push operation");
        Dlist.push(10); Dlist.push(20); Dlist.push(30);Dlist.push(40);
        Dlist.push(50); Dlist.push(60); Dlist.push(70);
        Dlist.traverse();
        System.out.println(Dlist.length());
        System.out.println("pop operation");
        Dlist.pop(); Dlist.pop(); Dlist.pop(); Dlist.pop();
        Dlist.traverse();
        System.out.println(Dlist.length());
        System.out.println("Shift Operation");
        Dlist.shift(); Dlist.traverse();
        System.out.println("Insert head operation");
        Dlist.insertHead(10); Dlist.traverse();
        System.out.println(Dlist.length());
        System.out.println("set operation");
        Dlist.set(22, 1);
        Dlist.traverse();
        System.out.println("push operation");
        Dlist.push(30); Dlist.push(40); Dlist.push(50); Dlist.push(60); Dlist.push(70);
        Dlist.traverse();
        System.out.println(Dlist.length());
        System.out.println("Get operation");
        System.out.println(Dlist.get(3));
        System.out.println(Dlist.get(1));
        System.out.println(Dlist.length());
        System.out.println("remove operation");
        Dlist.remove(3);
        Dlist.traverse();
        System.out.println(Dlist.length());
        System.out.println("Insert operation");
        Dlist.insert(5,55);
        System.out.println(Dlist.length());
        Dlist.traverse();
        Dlist.reverse();
        Dlist.traverse();
        Dlist.reverse();
        Dlist.traverse();
    }
}
