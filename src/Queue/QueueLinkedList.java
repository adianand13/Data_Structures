package Queue;

import LinkedList.Controller;
import LinkedList.Node;

public class QueueLinkedList {
    private Controller Queue = new Controller();

    public void enQueue(int value) { Queue.push(value); }

    public Node deQueue(){
        if (Queue.isEmpty()) {
            System.out.println("Queue Empty");
            return null;
        }
        else {
            System.out.println(Queue.getHead().getValue());
            return  Queue.shift();
        }
    }

    public boolean isEmpty(){ return Queue.isEmpty(); }

    public  int length(){ return  Queue.length(); }

    public void reset() {
        Queue = new Controller();
    }

    //test code
    public static void main(String[] args) {
        QueueLinkedList queueLinkedList = new QueueLinkedList();
        queueLinkedList.deQueue();
        queueLinkedList.enQueue(1);
        queueLinkedList.enQueue(2);
        queueLinkedList.enQueue(3);
        queueLinkedList.enQueue(4);
        queueLinkedList.enQueue(5);
        queueLinkedList.deQueue();
        queueLinkedList.deQueue();
        queueLinkedList.deQueue();
        queueLinkedList.deQueue();
        queueLinkedList.deQueue();
        queueLinkedList.deQueue();
    }
}
