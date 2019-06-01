package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Search {
    private static int[] arr={2,12,23,34,45,56,61,73,89,97};
    private static int recSearch(int start, int end, int key){
        if (end>0)  //base condition
        {
            int middle = 1+ (end-start) / 2;

            if (arr[middle] == key) return middle; //middle bound
                //lower bound
            else if (key < arr[middle]) return recSearch(start, middle - 1, key);
                //upper bound
            else return recSearch(middle + 1, end, key);
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a Number to search");
        int key = Integer.parseInt(bufferedReader.readLine());
        int pos = recSearch(0,arr.length-1,key);
        if (pos==-1) System.out.println(key+" is not present");
        else System.out.println("Value is present at " + pos);
    }
}
