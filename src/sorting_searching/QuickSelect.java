package sorting_searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class QuickSelect {

    private static int[] array;

    //function to swap two numbers in the array
    private static void swap(int i, int j){
        int temp = array[i];
        array[i]=array[j];
        array[j]=temp;
    }

    //function to perform quick select
    private static int select(int firstIndex,int lastIndex, int key){
        //to divide the array from random pivot point ∃, on the left array items are < pivot < array items on right
        int pivot=partition(firstIndex,lastIndex);

        //perform recursion on left side, if the key < pivot
        if (pivot>key)
            return select(firstIndex,pivot-1,key);
        //perform recursion on left side, if the key < pivot
        else if(pivot<key)
            return select(pivot+1,lastIndex,key);

        //base condition, when pivot == key
        return array[key];
    }

    //function to divide the array on the random pivot point and return that pivot point
    private static int partition(int firstIndex,int lastIndex){
        int pivot =new Random().nextInt(lastIndex-firstIndex+1) + firstIndex;

        //swapping the pivot point to last index for comparison
        swap(lastIndex,pivot);

        //comparing every element with pivot(last index) and swapping them
        for (int i = firstIndex; i < lastIndex; ++i) {
            //change > with < to get the smallest rank
            if (array[i]>array[lastIndex]){
                swap(i,firstIndex);
                firstIndex++;
            }
        }

        //final swap to put back pivot into middle point
        swap(firstIndex,lastIndex);
        return pivot;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Size of the array");
        int size=Integer.parseInt(bufferedReader.readLine());
        array = new int[size];
        System.out.println("Enter elements in the array");
        for (int i = 0; i < size; i++) {
            array[i]=Integer.parseInt(bufferedReader.readLine());
        }
        System.out.println("Enter rank");
        int key = Integer.parseInt(bufferedReader.readLine());
        int value = select(0,size-1,key-1);

        System.out.println("element at rank "+key+" is : "+value);
    }
}
