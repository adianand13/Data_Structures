package Frequency;
/*
/Program to check the number of unique values in an sorted arrays
 */
public class UniqueValues {
    private int[] Array;

    public UniqueValues(int[] array) {
        Array = array;
    }

    public int count(){
        int frequency = 0, previous=0;
        for (int i : Array)
            if (i != previous) {
                frequency++;
                previous = i;
            }
        return frequency;
    }

    //driver code
    public static void main(String[] args) {
        int[] array = {1,2,2,3,3,3,4,4,4,4,5,5,5,5,5,6,6,6,6,6,6,7,7,7,7,7,7,7};
        System.out.println(new UniqueValues(array).count());
    }
}
