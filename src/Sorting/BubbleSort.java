package Sorting;

public class BubbleSort {
    public int[] sort(int[] array){
        int steps = 0;
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array.length-1 ; j++) {
                if (array[j]>array[j+1]){
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;

                }
                System.out.println(++steps);
            }
        }
        return array;
    }

    public int[] sortOptimized(int[] array){
        int steps = 0;
        for (int i = array.length; i > 0 ; i--) {
            boolean noSwaps = true;
            for (int j = 0; j < i-1 ; j++) {
                if (array[j]>array[j+1]){
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                    noSwaps = false;
                }
                System.out.println(++steps);
            }
            if (noSwaps) break;
        }
        return array;
    }

    //driver code
    public static void main(String[] args) {
        int[] array = {1,12,21,45,3,56,190};
        int[] array2 = {1,12,21,45,3,56,190};

        array = new BubbleSort().sort(array);
        for (int i : array){
            System.out.print(i+" ");
        }
        System.out.println();
        array2 = new BubbleSort().sortOptimized(array2);
        for (int i : array2){
            System.out.print(i+" ");
        }
    }
}
