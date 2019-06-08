package recursion;
// Write a recursive program called isPalindrome which returns true if the
// string passed to it is a palindrome. Otherwise it returns false

// isPalindrome('awesome') // false
// isPalindrome('foobar') // false
// isPalindrome('tacocat') // true
// isPalindrome('amanaplanacanalpanama') // true
// isPalindrome('amanaplanacanalpandemonium') // false

public class Palindrome {
    private String s;
    private int N;

    public Palindrome(String s) {
        this.s = s;
        N = s.length()-1;
    }
    public boolean check(){
        return check(0,s.length()-1);
    }
    private boolean check(int start, int end){
        if (N%2!=0) return false;
        if (start<end){
            char right = s.charAt(start);
            char left = s.charAt(end);
            if (right == left){
                check(++start,--end);
                return true;
            }
            else{
                return false;
            }
        }else return true;

    }

    //driver code
    public static void main(String[] args) {
        String s = "tacocat";
        System.out.println(new Palindrome(s).check(0,s.length()-1));
    }
}
