package Frequency;
//write a program that accepts an array of integer and a number called N
//the program should calculate the maximum sum of N consecutive numbers int the array
// N < size of the array
public class MaxSubArraySum {
    public int sum(int[] array, int N){
        int sum = 0;
        if (N<array.length){
            int i=0,j=0;
            while (j<array.length){
                if(j<N){
                    sum=sum+array[j];
                    j++;
                }else{
                    int nSum = sum-array[i]+array[j];
                    if (nSum>sum){
                        sum=nSum;
                    }
                    j++;
                    i++;
                }
            }
        }
        return sum;
    }

    //driver code
    public static void main(String[] args) {
        MaxSubArraySum maxSubArraySum = new MaxSubArraySum();
        int[] array = {1,2,5,2,8,1,5};
        System.out.println(maxSubArraySum.sum(array,4));//expected 17
    }
}
