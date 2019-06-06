package Frequency;

import java.util.Arrays;

public class Anagram {
    private String String1;
    private String String2;

    public Anagram(String string1, String string2) {
        char[] temp = string1.toCharArray();
        Arrays.sort(temp);
        String1 = new String(temp);
        temp = string2.toCharArray();
        Arrays.sort(temp);
        String2 = new String(temp);
    }

    public boolean check(){
        if (String1.length()==String2.length()) {
                if (String1.equals(String2))
                    return true;
                else return false;
        }
        else return false;
    }

    //Driver code
    public static void main(String[] args) {
        Anagram anagram = new Anagram("anagram","nagaram");
        System.out.println(anagram.check());
    }
}
