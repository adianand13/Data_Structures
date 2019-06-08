package Sorting;

public class InsertionSort {
    private int[] array;
    private int N;

    public InsertionSort(int[] array) {
        this.array = array;
        N = array.length;
    }

    public int[] sortAsscending(){
        for (int i = 1,j; i < N; i++) {
            int value = array[i];
            for (j = i-1 ; j >= 0 && array[j]>value ; j--) {
                array[j+1] = array[j];
            }
            array[j+1] = value;
        }
        return array;
    }

    public int[] sortDesscending(){
        for (int i = 1,j; i < N; i++) {
            int value = array[i];
            for (j = i-1 ; j >= 0 && array[j]<value ; j--) {
                array[j+1] = array[j];
            }
            array[j+1] = value;
        }
        return array;
    }

    //driver code
    public static void main(String[] args) {
        int[] array = {1,2,9,6,76,20};
        array = new InsertionSort(array).sortDesscending();
        for (int i :
                array) {
            System.out.print(i+" ");
        }

    }
}
