package Heap;

import java.util.LinkedList;

public class MaxBinaryHeap {

    LinkedList<Integer> List = new LinkedList<Integer>();

    public void insert(int element){
        List.push(element);
        bubbleup();
    }

    private void bubbleup(){
        int index = List.size()-1;
        int element = List.get(index);
        while (true){
            int parentIndex = (index-1)/2;
            int parent = List.get(parentIndex);
            if (element <= parent)
                break;
            List.set(parentIndex,element);
            List.set(index,parent);
            index = parentIndex;
        }
    }
}
