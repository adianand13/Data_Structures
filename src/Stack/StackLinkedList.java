package Stack;

import LinkedList.Controller;

public class StackLinkedList {
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
        StackLinkedList stackLinkedList = new StackLinkedList();
        stackLinkedList.push(1);
        stackLinkedList.push(2);
        stackLinkedList.push(3);
        stackLinkedList.push(4);
        stackLinkedList.push(5);
        stackLinkedList.push(6);
        stackLinkedList.pop();
        stackLinkedList.pop();
        stackLinkedList.pop();
        stackLinkedList.pop();
        stackLinkedList.pop();
        stackLinkedList.pop();
        stackLinkedList.pop();
    }
}
