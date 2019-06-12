package Stack;

import LinkedList.Controller;

public class ArrayLinkedList {
    private Controller controller = new Controller();

    public void push(int n){
        controller.insertHead(n);
    }

    public void pop(){
        if (controller.getHead() == null){
            System.out.println("stack Empty");
        }else {
            System.out.println(controller.getHead().getValue());
            controller.shift();
        }


    }
    //test code
    public static void main(String[] args) {
        ArrayLinkedList arrayLinkedList = new  ArrayLinkedList();
        arrayLinkedList.push(1);
        arrayLinkedList.push(2);
        arrayLinkedList.push(3);
        arrayLinkedList.push(4);
        arrayLinkedList.push(5);
        arrayLinkedList.push(6);
        arrayLinkedList.pop();
        arrayLinkedList.pop();
        arrayLinkedList.pop();
        arrayLinkedList.pop();
        arrayLinkedList.pop();
        arrayLinkedList.pop();
        arrayLinkedList.pop();
    }
}
