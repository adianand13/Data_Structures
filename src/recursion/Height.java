package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Height {
    private static int buidLayer(int height){
        if (height == 0) return height; //base condition

        buidLayer(height-1); //head recursion

        System.out.println(height);

        return height;
    }
    private static int buidLayer2(int height){
        if (height == 0) return height;

        System.out.println(height); //base recursion

        buidLayer2(height-1);

        return height;
    }

    public static void main(String[] args)throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number");
        int height = Integer.parseInt(bufferedReader.readLine());
        buidLayer(height);
        buidLayer2(height);
    }
}
