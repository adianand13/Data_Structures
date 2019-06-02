package Sorting;

public class InsertionSort {
    private int[] array;
    private int N;

    public InsertionSort(int[] array) {
        this.array = array;
        N = array.length;
    }

    public int[] sortAsscending(){
        int i = 1;
        while (i<N){
            int value = array[i];
            int j = i-1;
            while (j>=0 && array[j]>value){
                array[j+1] = array[j];
                j = j-1;
            }
            array[j+1] = value;
        }
        return array;
    }

    public int[] sortDesscending(){
        int i = 1;
        while (i<N){
            int value = array[i];
            int j = i-1;
            while (j>=0 && array[j]<value){
                array[j+1] = array[j];
                j = j-1;
            }
            array[j+1] = value;
        }
        return array;
    }
}
