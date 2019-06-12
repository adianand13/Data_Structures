package Queue;

public class ArrayQueue {
    private int[] Queue;
    private int N;
    private int Rear;
    private int Front;

    public ArrayQueue(int size) {
        N = size;
        Queue = new int[N];
        Rear = Front = 0;
    }

    public boolean enQueue(int n){
        if (Rear < N){
            Queue[Rear ++] = n;
            return true;
        }else {
            System.out.println("Queue Full");
            return false;
        }
    }

    public boolean deQueue(){
        if (Front == Rear){
            System.out.println("Queue Empty");
            return false;
        }else if(Front == N){
            System.out.println("Reset Queue");
            return false;
        }else {
            System.out.println(Queue[Front++]);
            return true;
        }
    }

    public void reset(){
        Front = Rear = 0;
    }

    //test code
    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(5);
        arrayQueue.deQueue();
        System.out.println(arrayQueue.enQueue(1));
        System.out.println(arrayQueue.enQueue(2));
        System.out.println(arrayQueue.enQueue(3));
        System.out.println(arrayQueue.enQueue(4));
        System.out.println(arrayQueue.enQueue(5));
        System.out.println(arrayQueue.enQueue(5));
        arrayQueue.deQueue();
        arrayQueue.deQueue();
        arrayQueue.deQueue();
        arrayQueue.deQueue();
        arrayQueue.deQueue();
        arrayQueue.deQueue();
    }
}
