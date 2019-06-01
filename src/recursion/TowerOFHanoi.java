package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TowerOFHanoi {
    private static long count = 0;
    private static void solveHanoi(int n, char source, char aux, char destination){

        if (n==1){
            System.out.println(++count+": Plate 1 from "+source+" to "+destination);
            return;
        }
        solveHanoi(n-1, source,destination,aux);
        System.out.println(++count+": Plate "+(n)+" from "+source+" to "+destination);
        solveHanoi(n-1,aux,source,destination);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Number of disks");
        int N = Integer.parseInt(bufferedReader.readLine());
        solveHanoi(N,'A','B','C');
        bufferedReader.close();
    }
}
