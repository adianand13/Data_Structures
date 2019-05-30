package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {
    private static  int factotial(int acc, int N){
        if (N==0) return acc; //base condition

        return factotial(N*acc,N-1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number");
        int number = Integer.parseInt(bufferedReader.readLine());
        System.out.println(factotial(1,number));
    }
}
