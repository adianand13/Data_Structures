package Frequency;
// Write a program which accepts two positive integers,
// find out if the two numbers have the same frequency of digits.

// Your solution MUST have the following complexities:
// Time: O(N)

import java.util.Arrays;

//  sameFrequency(182, 281) // true
//  sameFrequency(34, 14) // false
//  sameFrequency(3589578, 5879385) // true
//  sameFrequency(22, 222) // false
public class DigitFrequency {
    public boolean find(int d1 , int d2){
        char[] digit1 = (""+d1).toCharArray();
        char[] digit2 = (""+d2).toCharArray();
        if(digit1.length==digit2.length){
            Arrays.sort(digit1);
            Arrays.sort(digit2);
            for (int i = 0; i< digit1.length; i++){
                if (digit1[i]!=digit2[i])
                    return false;
            }
            return true;
        }else return false;
    }

    //Driver Code
    public static void main(String[] args) {
        System.out.println(new DigitFrequency().find(182, 281));
        System.out.println(new DigitFrequency().find(22, 222));
    }
}
