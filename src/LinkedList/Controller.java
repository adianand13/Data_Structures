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

    public boolean isEmpty() {
        return (Head == null);
    }

    public boolean push(int value) {
        if (Head == null) {
            Head = Tail = new Node(value);
            Length++;
            return true;
        } else {
            Tail.setNext(new Node(value));
            Tail = Tail.getNext();
            Length++;
            return true;
        }
    }

    public boolean pop() {
        if (Head == null) {
            return false;
        } else if (Head == Tail) {
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

    //Insert a new node to start
    public boolean insertHead(int value){
        if (Head == null) return false;
        Head = new Node(value,Head);
        Length ++;
        return true;
    }

    //insert at specific index
    public boolean insert(int index, int value){
        if (index < 0 || index >= Length)
            System.out.println("IndexOutOfBoundsException");
        else if(index == 0)
            return insertHead(value);
        else if (index == Length-1){
            push(value);
            return true;
        }
        else {
            Node iterator = Head.getNext();
            for (int i = 1; i <index; i++) {
                iterator = iterator.getNext();
            }
            iterator.setNext(new Node(value,iterator.getNext()));
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
            for (int i = 1; i <= index; i++) {
                iterator = iterator.getNext();
            }
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
            for (int i = 1; i <= index; i++) {
                iterator = iterator.getNext();
            }
            iterator.setValue(value);
        }
        return true;
    }

    //test code
    public static void main(String[] args) {
        Controller list = new Controller();
        System.out.println(list.isEmpty());
        list.push(10);
        list.push(20);
        list.push(30);
        list.push(40);
        list.push(50);
        list.push(60);
        list.push(70);
        list.traverse();
        System.out.println(list.Length);
        list.pop();
        list.pop();
        list.pop();
        list.pop();
        list.traverse();
        System.out.println(list.Length);
        list.shift();
        list.traverse();
        System.out.println(list.Length);
        list.insertHead(10);
        list.traverse();
        System.out.println(list.Length);
        list.set(22,1);
        System.out.println(list.get(3));
        System.out.println(list.get(1));
        System.out.println(list.isEmpty());
    }
}
