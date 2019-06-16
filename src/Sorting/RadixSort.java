package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RadixSort {
    private int getDigit(int digit, int pos){
        int ten = (int)Math.pow(10,pos);
        return (digit/ten)%10;
    }

    private int digitCount(int digit){
        if (digit==0) return 1;
        return (int)Math.log10(digit)+1;
    }

    private int mostDigits(int[] digits){
        int max = 0;
        for (int i : digits) {
            i = digitCount(i);
            if(max < i) max = i;
        }
        return max;
    }

//    public int[] sort(int[] array){
//        int largest = mostDigits(array);
//        ArrayList<Integer> all = new ArrayList<Integer>();
//        for (int i= 0; i < largest; i++){
//            ArrayList<Integer> b0 = new ArrayList<Integer>();
//            ArrayList<Integer> b1 = new ArrayList<Integer>();
//            ArrayList<Integer> b2 = new ArrayList<Integer>();
//            ArrayList<Integer> b3 = new ArrayList<Integer>();
//            ArrayList<Integer> b4 = new ArrayList<Integer>();
//            ArrayList<Integer> b5 = new ArrayList<Integer>();
//            ArrayList<Integer> b6 = new ArrayList<Integer>();
//            ArrayList<Integer> b7 = new ArrayList<Integer>();
//            ArrayList<Integer> b8 = new ArrayList<Integer>();
//            ArrayList<Integer> b9 = new ArrayList<Integer>();
////            ArrayList[] bucket= new ArrayList[10];
//            for (int j = 0; j < array.length; j++){
//                int digit = getDigit(array[j],i);
//                switch (digit){
//                    case 0 : b0.add(array[j]);
//                        break;
//                    case 1 : b1.add(array[j]);
//                        break;
//                    case 2 : b2.add(array[j]);
//                        break;
//                    case 3 : b3.add(array[j]);
//                        break;
//                    case 4 : b4.add(array[j]);
//                        break;
//                    case 5 : b5.add(array[j]);
//                        break;
//                    case 6 : b6.add(array[j]);
//                        break;
//                    case 7 : b7.add(array[j]);
//                        break;
//                    case 8 : b8.add(array[j]);
//                        break;
//                    case 9 : b9.add(array[j]);
//                        break;
//                }
//            all.addAll(b0);
//            all.addAll(b1);
//            all.addAll(b2);
//            all.addAll(b3);
//            all.addAll(b4);
//            all.addAll(b5);
//            all.addAll(b6);
//            all.addAll(b7);
//            all.addAll(b8);
//            all.addAll(b9);
//            }
//        }
//    }

    //test code
    public static void main(String[] args) {
        System.out.println(new RadixSort().getDigit(12345,1));
        System.out.println(new RadixSort().digitCount(0));
    }
}
