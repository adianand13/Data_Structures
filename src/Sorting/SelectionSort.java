package Sorting;

public class SelectionSort {
    private int[] array;
    public SelectionSort(int[] array) {
        this.array=array;
    }
    public int[] sortAsscending(){
        int n = array.length;
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (array[j] < array[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = temp;
        }
        return array;
    }
    public int[] sortDescending()
    {
        int n = array.length;
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int max_idx = i;
            for (int j = i+1; j < n; j++)
                if (array[j] > array[max_idx])
                    max_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = array[max_idx];
            array[max_idx] = array[i];
            array[i] = temp;


        }
        return array;
    }
}
