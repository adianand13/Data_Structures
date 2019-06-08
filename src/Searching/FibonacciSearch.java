/**
 * Fibonacci Search is the search which uses fibonacci numbers to search an element in an sorted array
 * Its divide and conquer algorithm
 * since binary search uses division operator to get the pivot point
 * the division operator is a CPU intensive (in comparison to -, + operation)
 * This is also useful when the array is large to fit in memory
 *
 * Algorithm
 *      -> find the largest possible fibonacci number such that it is < N
 *      -> compare the value present at fibonacci number position in array
 *          -> if value is less then shift to next lowest fibonacci number for comparison
 *          -> if the value is greater shift to upper next fibonacci comparison
 *          -> if equal, value is found
 * */

package Searching;

public class FibonacciSearch {
    private int[] array;
    private int N;

    public FibonacciSearch(int[] array) {
        this.array = array;
        N = array.length;

        int fib1 = 0;
        int fib2 = 1;
        int fibM = fib1 + fib2;

        while (fibM<N){
            fib1 = fib2;
            fib2 = fibM;
            fibM = fib1 + fib2;
        }

        int offset = 1;
    }


}
