package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Euclidean_GCD {

    private static int GCD(int N1, int N2){
        if (N2==0) return N1;
        return GCD(N2,N1%N2);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter two number");
        int num1 = Integer.parseInt(bufferedReader.readLine());
        int num2 = Integer.parseInt(bufferedReader.readLine());
        System.out.println(GCD(num1,num2));
    }
}
