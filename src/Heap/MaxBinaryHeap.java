package Heap;

import java.util.LinkedList;

public class MaxBinaryHeap {

    LinkedList<Integer> List = new LinkedList<Integer>();

    public void insert(int element){
        List.push(element);
        bubbleup();

    }

    public void bubbleup(){

    }
}
