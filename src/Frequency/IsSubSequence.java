package Frequency;
// Write a program which takes in two strings and checks whether
// the characters in the first string form a subsequence of the characters in the second
// string. In other words, the program should check whether the characters in the first
// string appear somewhere in the second string, without their order changing.

// Examples:
// 1     isSubsequence('hello', 'by hecatl in lo world')
// 2     isSubsequence('sing', 'sting')
// 3     isSubsequence('abc', 'abracadabra')
// 4     isSubsequence('abc', 'acb')

// Your solution MUST have AT LEAST the following complexities:
// Time Complexity - O(N + M)
// Space Complexity - O(1)

public class IsSubSequence {
    public boolean find(String sub, String major){
        for (int i = 0,j=0; i < major.length(); i++) {
            if (sub.charAt(j)==major.charAt(i))j++;
            if (j==sub.length()-1) return true;
        }
        return false;
    }

    //driver code
    public static void main(String[] args) {
        System.out.println(new IsSubSequence().find("hello", "by hecatl in lo world"));
    }
}
