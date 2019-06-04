package Sorting;

import java.util.Random;

public class QuickSort {
    private int[] array;
    private int N;

    public QuickSort(int[] array) {
        this.array = array;
        N = array.length;
    }

    public int[] sort(){
        sort(0,N-1);
        return array;
    }
    private void sort(int firstIndex, int lastIndex){
        if (firstIndex>lastIndex) return;
        int pivot = partition(firstIndex,lastIndex);
        sort(firstIndex,pivot-1);
        sort(pivot+1,lastIndex);
    }

    private int partition(int firstIndex,int lastIndex){
        int pivot = firstIndex+((firstIndex+lastIndex)/2);
        swap(lastIndex,pivot);

        while(firstIndex!=lastIndex){
            if (array[firstIndex]<pivot){
                firstIndex++;
            }else{
                swap(firstIndex,pivot);
            }
            firstIndex++;
        }
        return pivot;
    }

    private void swap(int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    //test code
    public static void main(String[] args) {
        int[] array = {23,12,1,90,56,75,1028,567,2,3,7,29,38,42,36};
        array = new QuickSort(array).sort();
        for (int a:
             array) {
            System.out.println(a);
        }
    }
}
