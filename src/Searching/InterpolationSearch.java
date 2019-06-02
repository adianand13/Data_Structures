/**
 *Interpolation Search is improvement of over binary search.
 * where instead of middle element, the searching is polarised towards far beginning or end
 * i.e higher value if the position is near to upper bound
 * or, have lower value if the position is near to lowe bound
 *
 * @author Aditya Anand
 * */

package Searching;

public class InterpolationSearch {
    private int[] array;
    private int N;

    public InterpolationSearch(int[] array) {
        this.array = array;
        N = array.length;
    }

    public int search(int key){
        int lb= 0, ub = N-1,pos;
        while (lb<=ub && key>= array[lb] && key <= array [ub]){
            pos = lb + ((key-array[lb])*(ub-lb) / (array[ub]-array[lb]));

            if (lb == ub)
            {
                if (array[lb] == key) return lb;
                return -1;
            }

            if(key==array[pos])
                return pos;
            else if (key<array[pos])
                ub=pos-1;
            else
                lb = pos+1;
        }
        return -1;
    }

    //test code
    public static void main(String[] args) {
        int[] arr = {2,7,11,20,22,23,24,31,34,40,42,45,48,49,50,51,56,57,59,60,63,66,76,77,78,82,84,86,87,88,89,92,93,95,99};
        int pos = new InterpolationSearch(arr).search(87);
        System.out.println(pos);
    }
}

