package Searching;

public class BinnaySearch {
    private int[] array;

    public BinnaySearch(int[] array) {
        this.array = array;
    }
    public int search(int key){
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
}
