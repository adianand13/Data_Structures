package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sum {
    private static int recursiveSum(int N){
        if (N==1) return 1; //base condition
        return N + recursiveSum(N-1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number");
        int number = Integer.parseInt(bufferedReader.readLine());
        int sum = recursiveSum(number);
        System.out.println(sum);
        bufferedReader.close();
    }
}
