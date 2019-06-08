package Frequency;
// Write a program which accepts a sorted array of integers and a target average,
// determine if there is a pair of values in the array where the average of the pair equals the
// target average. There may be more than one pair that matches the average

// Bonus Contrains:
// Time: O(N)
// Space: O(1)
// Sample Input:
//      averagePair([1,2,3], 2.5); // true
//      averagePair([1,3,3,5,6,7,10,12,19], 8); // true
//      averagePair([-1,0,3,4,5,6], 4.1); // false
//      averagePair([], 4); // false
public class AveragePair {
    public boolean find(int[] array, double Average){
        int previous = 0;
        for (int i: array) {
            double average = ((previous+i)*1.0)/2;
            if (average == average)
                return true;
        }
        return false;
    }

    //Driver code
    public static void main(String[] args) {
        int[] array = {1,3,3,5,6,7,10,12,19};
        System.out.println(new AveragePair().find(array,8));
    }
}
