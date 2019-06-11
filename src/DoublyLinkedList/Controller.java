package DoublyLinkedList;

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
            Tail.setNext(new Node(value,null,Tail));
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
            Tail = Tail.getPrevious();
            Tail.setNext(null);
            Length --;
            return true;
        }
    }

    public void traverse() {
        if (Head == null) System.out.println("Empty DList");
        else {
            for (Node iterator = Head;
                 iterator != null;
                 iterator = iterator.getNext())
                    System.out.print(iterator.getValue() + " ");
            System.out.println();
        }
    }

    public void reverse() {
        if (Head == null) System.out.println("Empty DList");
        else {
            for (Node iterator = Tail;
                 iterator !=null;
                 iterator = iterator.getPrevious())
                    System.out.print(iterator.getValue() + " ");
            System.out.println();
        }
    }

    public boolean shift(){
        if (Head == null) return false;
        Head = Head.hasNext() ? Head.getNext() : null;
        if (Head!=null) Head.setPrevious(null);
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
            int mid = Length/2;
            // to reduce time complexity to O(N/2)
            if (index <= mid){
                Node iterator = Head.getNext();
                for (int i = 1; i <index; i++)
                    iterator = iterator.getNext();
                iterator.setNext(iterator.getNext().getNext());
                iterator.getNext().setPrevious(iterator);
            }else {
                Node iterator = Tail.getPrevious();
                for (int i = Length-1; i > index; i--)
                    iterator = iterator.getPrevious();
                iterator.setPrevious(iterator.getPrevious().getPrevious());
                iterator.getPrevious().setNext(iterator);
            }
            Length --;
            return true;
        }
        return false;
    }
    //Insert a new node to start
    public void insertHead(int value){
        if (Head == null) push(value);
        Head = new Node(value,Head);
        Head.getNext().setPrevious(Head);
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
            int mid = Length/2;
            if (index <= mid){
                Node iterator = Head.getNext();
                for (int i = 1; i < index-1; i++)
                    iterator = iterator.getNext();
                System.out.println(iterator.getNext().getValue()+" "+iterator.getValue()+" "+iterator.getPrevious().getValue());
                iterator.setNext(new Node(value,iterator.getNext(),iterator));
                iterator.getNext().getNext().setPrevious(iterator.getNext());
            }else {
                Node iterator = Tail.getPrevious();
                for (int i = Length-1 ; i > ++index; i--)
                    iterator = iterator.getPrevious();
                iterator.setPrevious(new Node(value,iterator,iterator.getPrevious()));
                iterator.getPrevious().getPrevious().setNext(iterator.getPrevious());
            }
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
            int mid = Length/2;
            // to reduce time complexity to O(N/2)
            if (index <= mid){
                Node iterator = Head.getNext();
                for (int i = 1; i < index; i++)
                    iterator = iterator.getNext();
                return iterator.getValue();
            }else {
                Node iterator = Tail.getPrevious();
                for (int i = Length; i > index; i--)
                    iterator = iterator.getPrevious();
                return iterator.getValue();
            }
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
            int mid = Length/2;
            Node iterator;
            // to reduce time complexity to O(N/2)
            if (index <= mid){
                iterator = Head.getNext();
                for (int i = 1; i <index; i++)
                    iterator = iterator.getNext();
            }else {
                iterator = Tail.getPrevious();
                for (int i = Length; i > index; i--)
                    iterator = iterator.getPrevious();
            }
            iterator.setValue(value);
            return true;
        }
        return true;
    }

    public static void main(String[] args) {
        Controller list = new Controller();
        System.out.println(list.isEmpty());
        System.out.println("push operation");
        list.push(10); list.push(20); list.push(30);list.push(40);
        list.push(50); list.push(60); list.push(70);
        list.traverse();
        list.reverse();
        System.out.println(list.length());
        System.out.println("pop operation");
        list.pop(); list.pop(); list.pop(); list.pop();
        list.traverse();
        list.reverse();
        System.out.println(list.length());
        System.out.println("Shift Operation");
        list.shift(); list.traverse();
        System.out.println("Insert head operation");
        list.insertHead(10); list.traverse();
        System.out.println(list.length());
        System.out.println("set operation");
        list.set(22, 1);
        list.reverse();
        System.out.println("push operation");
        list.push(30); list.push(40); list.push(50); list.push(60); list.push(70);
        list.traverse();
        list.reverse();
        System.out.println(list.length());
        System.out.println("Get operation");
        System.out.println(list.get(3));
        System.out.println(list.get(1));
        System.out.println(list.length());
        System.out.println("remove operation");
        list.remove(5);
        list.traverse();
        list.reverse();
        System.out.println(list.length());
        System.out.println("Insert operation");
        list.insert(5,55);
        System.out.println(list.length());
        list.traverse();
        list.reverse();
    }
}
