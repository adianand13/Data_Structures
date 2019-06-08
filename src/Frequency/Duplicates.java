package Frequency;
// write a program which accepts a variable number of arguments,
// and checks whether there are any duplicates among the arguments passed in.
// You can solve this using the frequency counter pattern OR the multiple pointers pattern.

// areThereDuplicates(1, 2, 3) // false
// areThereDuplicates(1, 2, 2) // true
// areThereDuplicates('a', 'b', 'c', 'a') // false

import java.util.Arrays;

public class Duplicates {

    public boolean find(int[] AnInt) {
        Arrays.sort(AnInt);
        int previous=AnInt[0];
        for (int i =1; i<AnInt.length; i++){
            if (AnInt[i]==previous){
                return true;
            }
            previous = AnInt[i];
        }
        return false;
    }

    public boolean find(char[] AChar) {
        Arrays.sort(AChar);
        int previous=AChar[0];
        for (int i =1; i<AChar.length; i++){
            if (AChar[i]==previous){
                return true;
            }
        }
        return false;
    }

    //driver code
    public static void main(String[] args) {
        int[] array = {1, 2, 2};
        int[] arr = {'a','b','c','a'};
        System.out.println(new Duplicates().find(array));
        System.out.println(new Duplicates().find(arr));
    }
}
