/**
 * In Exponential search, we find the range of searching by comparing the index at i*2^n where n is the exponential value
 *Exponential search involves two steps:
 *     -> Find range where element is present
 *     -> Do Binary/Interpolation Search in above found range.
 * */

package Searching;

public class ExponentialSearch {
    private int[] array;
    private int N;

    public ExponentialSearch(int[] array) {
        this.array = array;
        N = array.length;
    }

    public int search(int key){
        if (key==array[0])
            return 0;
        int i =1;
        //finding the range
        while (i<N && array[i]<key)
            i=i*2;

        //performing search in the subarray range
        int LoBound=0,UpBound=array.length-1,mid;
        while(LoBound<UpBound){
            mid=(LoBound+UpBound)/2;
            if (array[mid]==key)
                return mid;
            else if (array[mid]<key)
                UpBound =mid-1;
            else
                LoBound=mid+1;
        }
        return -1;
    }

    //test code
    public static void main(String[] args) {
        int[] arr = {2,7,11,20,22,23,24,31,34,40,42,45,48,49,50,51,56,57,59,60,63,66,76,77,78,82,84,86,87,88,89,92,93,95,99};
        int pos = new ExponentialSearch(arr).search(89);
        System.out.println(pos);
    }
}
