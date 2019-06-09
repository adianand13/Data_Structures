package Sorting;
import java.util.Arrays;

public class MergeSort {

    public int[] sort(int[] arr){
        if (arr.length <= 1)
            return arr;

        int mid = arr.length/2;

        int[] left = new int[mid];
        System.arraycopy(arr, 0, left, 0, mid);

        int[] right = new int[arr.length-mid];
        System.arraycopy(arr, mid, right, 0, arr.length-mid);

        left = sort(left);
        right = sort(right);

        return merge(left, right);

    }

    private int[] merge(int[] a1, int[] a2){
        int i = 0,j = 0, n1 = a1.length, n2 = a2.length;
        //{1,10,50} {2,14,99,100}
        int[] merged = new int[n1+n2];
        while(i < n1 || j < n2){
            if (i < n1){
                if (j < n2){
                    if (a1[i]<a2[j]){
                        merged[i+j] = a1[i];
                        i++;
                    }else {
                        merged[i+j] = a2[j];
                        j++;
                    }
                }else{
                    merged[i+j] = a1[i];
                    i++;
                }
            }else{
                merged[i+j] = a2[j];
                j++;
            }
        }
        return merged;
    }


    //test code
    public static void main(String[] args) {
        int[] array = {10,24,76,73,72,1,9};
        System.out.println(Arrays.toString(array));
        array = new MergeSort().sort(array);
        System.out.println(Arrays.toString(array));
    }
}
