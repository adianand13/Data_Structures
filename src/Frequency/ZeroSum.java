package Frequency;
/*Write a program called sumZero which accepts a sorted array of integer.
/the program should find the first pair of integer where sum is zero
 */
public class ZeroSum {
    private int[] array;

    public ZeroSum(int[] array) {
        this.array = array;
    }

    public int[] check(){
        int i = 0, j=array.length-1;
        while (i<=j){
            if ( (array[i]+array[j]) == 0 ){
                int[] ret = {array[i],array[j]};
                return ret;
            }else if (Math.abs(array[i]) > Math.abs(array[j]))
                i++;
            else if (Math.abs(array[i]) < Math.abs(array[j]))
                j--;
        }
        return null;
    }
    //driver code
    public static void main(String[] args) {
        int[] array = {12,-6,-3,-2,-1,0,1,3,4,6,23,};
        ZeroSum zeroSum = new ZeroSum(array);
        int[] result = zeroSum.check();
        if (result!=null)
            for (int i: result) {
                System.out.print(i+", ");
            }
        else System.out.println("empty set");
    }
}
