package Queue;

import LinkedList.Controller;

public class QueueLinkedList {
    private Controller Queue = new Controller();

    public void enQueue(int value) { Queue.push(value); }

    public void deQueue(){
        if (Queue.isEmpty()) System.out.println("Queue Empty");
        else {
            System.out.println(Queue.getHead().getValue());
            Queue.shift();
        }
    }

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
