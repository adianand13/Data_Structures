/*
* @author Aditya Anand
* @date 04-05-2019
* Write a program that accepts two array.
* The program should return value true,
* if every value in the 1st array has its corresponding Square value in the array 2
* The frequency of the values must be same.
* */

package Frequency;

import Sorting.SelectionSort;

public class SquareFrequency {
    private int[] arr1;
    private int[] arr2;

    public SquareFrequency(int[] arr1, int[] arr2) {
        this.arr1 = arr1;
        this.arr2 = arr2;
    }


    public boolean loopCalc(){
        if (arr1.length == arr2.length){
            arr1 = new SelectionSort(arr1).sortAsscending();
            arr2 = new SelectionSort(arr2).sortAsscending();
            int j = 0;
            for (int i : arr1){
                if (i*i!=arr2[j]) return false;
                j++;
            }
        }else {
            return false;
        }
        return true;
    }

    //Test main method
    public static void main(String[] args) {
        int[] ar1 = {1,2,3,4,5}, ar2 ={1,4,9,16,25,};
        SquareFrequency squareFrequency = new SquareFrequency(ar1,ar2);
        System.out.println(squareFrequency.loopCalc());
    }
}
