package Frequency;

public class Anagram {
    private char[] String1;
    private char[] String2;
    private int N;

    public Anagram(String string1, String string2) {
        String1 = string1.toCharArray();
        String2 = string2.toCharArray();
        N = String1.length;
    }

    public boolean check(){
        if (String1.length==String2.length) {
            sort();
            for (int i = 0; i < N; i++)
                if (String1[i] != String2[i])
                    return false;
        }
        else return false;
        return true;
    }

    private void sort(){
        for (int i = 0; i < N; i++)
        {
            // Find the minimum element in unsorted array
            int small = i;
            for (int j = i+1; j < N; j++)
                if ((int)String1[j] <  (int)String1[small])
                    small = j;
            // Swap the found minimum element with the first element
            char temp = String1[small];
            String1[small] = String1[i];
            String1[i] = temp;
        }
        for (int i = 0; i < N; i++)
        {
            // Find the minimum element in unsorted array
            int small = i;
            for (int j = i+1; j < N; j++)
                if ((int)String2[j] <  (int)String2[small])
                    small = j;
            // Swap the found minimum element with the first element
            char temp = String2[small];
            String2[small] = String2[i];
            String2[i] = temp;
        }
    }

    //Driver code
    public static void main(String[] args) {
        Anagram anagram = new Anagram("anagram","nagaram");
        System.out.println(anagram.check());
    }
}
