package Searching;

public class SubStringSearch {
    private String Major;
    private String Minor;

    public SubStringSearch(String major, String minor) {
        Major = major;
        Minor = minor;
    }

    public boolean find(){
        int count = 0;
        for (int i = 0; i <Major.length() ; i++) {
            for (int j = 0; j <Minor.length() ; j++) {
                if (Major.charAt(i+j) == Minor.charAt(j)){
                    count++;
                    if (count == Minor.length())
                        return true;
                }else break;
            }
        }
        return false;
    }

    //driver code
    public static void main(String[] args) {
        System.out.println(new SubStringSearch("macbook","cbo").find());
    }
}
